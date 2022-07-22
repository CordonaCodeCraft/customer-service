package tech.cordona.customer.persistence

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(
	basePackages = [
		"tech.cordona.customer.persistence"
	]
)
@EntityScan(
	basePackages = [
		"tech.cordona.customer.model"
	]
)
class PersistenceConfig