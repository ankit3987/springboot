package dev.inder.kmp

import org.springframework.stereotype.Service
import org.springframework.jdbc.core.JdbcTemplate
import java.util.UUID

data class Message(val id: String?, val text: String)

@Service
class MessageService(val db: JdbcTemplate) {
    fun findMessages(): List<Message> = db.query("select * from messages") { response, _ ->
        Message(response.getString("id"), response.getString("text"))
    }

    fun save(message: Message) {

        val messageId = message.id ?: UUID.randomUUID().toString()

        db.update(
            "insert into messages values ( ?, ? )",
            messageId, message.text
        )
    }
}