package tech.cordona.service.customer.application

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(
	basePackages = [
		"tech.cordona.service.customer.api"
	]
)
class CustomerApplicationConfig