package dev.inder.kmp

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KmpApplication

fun main(args: Array<String>) {
	runApplication<KmpApplication>(*args)
}

@RestController
@Tag(name = "Hello", description = "Saying hello.")
class HelloController() {

	@Operation(summary = "returns a greeting", responses = [
		ApiResponse(responseCode = "200", description = "Hello, name!")
	])
	@GetMapping("/hello")
	fun sayHello(@RequestParam("name") name: String) = "Hello, $name!"

	@GetMapping("/static")
	fun sample() = listOf(
		Message("1", "Hello!"),
		Message("2", "Bonjour!"),
		Message("3", "Privet!"),
	)
}

@RestController
@Tag(name = "Messages", description = "Showcasing the use of HTTP GET/POST methods related to messages.")
class MessageController(val messageService: MessageService) {

	@GetMapping("/messages")
	fun readAllMessages() = messageService.findMessages()

	@GetMapping("/message/{id}")
	fun readSingleMessage(@PathVariable id: String): List<Message> =
		messageService.findMessageById(id)

	@PostMapping("/message")
	fun writeMessage(@RequestBody message: Message) {
		messageService.save(message)
	}
}

@RestController
@Tag(name = "Notes", description = "Showcasing the use of HTTP GET/POST methods related to notes.")
class NoteController(val notesService: NotesService) {

	@GetMapping("/notes")
	fun readAllNotes() = notesService.findNotes()

	@GetMapping("/note/{id}")
	fun readSingleNote(@PathVariable id: String): List<Note> =
		notesService.findNoteById(id)

	@PostMapping("/note")
	fun writeNote(@RequestBody note: Note) {
		notesService.save(note)
	}
}


