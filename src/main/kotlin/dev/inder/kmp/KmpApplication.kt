package dev.inder.kmp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
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
class MessageController(val service: MessageService) {

	@GetMapping("/hello")
	fun sayHello(@RequestParam("name") name: String) = "Hello, $name!"

	@GetMapping("/")
	fun index() = listOf(
		Message("1", "Hello!"),
		Message("2", "Bonjour!"),
		Message("3", "Privet!"),
	)

	@PostMapping("/message")
	fun createMessage(@RequestBody message: Message) {
		service.save(message)
	}
}
