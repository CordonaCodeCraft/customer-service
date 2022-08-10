package tech.cordona.service.customer.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CustomerApplication

fun main(args: Array<String>) {
	runApplication<CustomerApplication>(*args)
}