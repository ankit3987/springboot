package dev.inder.kmp

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Table("NOTES")
data class Note(@Id var id: String?, val text: String)

interface NotesRepository : CrudRepository<Note, String>

@Service
class NotesService(val db: NotesRepository) {
    fun findNotes(): List<Note> = db.findAll().toList()

    fun findNoteById(id: String): List<Note> = db.findById(id).toList()

    fun save(note: Note) {
        db.save(note)
    }

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}