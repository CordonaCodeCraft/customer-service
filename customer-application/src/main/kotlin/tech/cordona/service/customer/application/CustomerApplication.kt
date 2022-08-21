package tech.cordona.service.customer.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class CustomerApplication

fun main(args: Array<String>) {
	runApplication<CustomerApplication>(*args)
}