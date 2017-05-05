package daggerok

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress

@RestController
@SpringBootApplication
class MicroserviceApplication {
  @GetMapping fun index() = mapOf("message" to "hello ${InetAddress.getLocalHost().hostName ?: "<hostName>"} : ${InetAddress.getLocalHost().hostAddress ?: "<hostAddress>"}")
}

fun main(args: Array<String>) {
  SpringApplication.run(MicroserviceApplication::class.java, *args)
}
