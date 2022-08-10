package tech.cordona.service.customer.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/customer/")
class CustomerController {

	@GetMapping("test")
	fun test() = "Works"
}