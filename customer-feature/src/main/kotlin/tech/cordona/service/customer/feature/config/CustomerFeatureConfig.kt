package tech.cordona.service.customer.feature.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableTransactionManagement
@EntityScan(
	basePackages = [
		"tech.cordona.service.customer.model"
	]
)
class CustomerFeatureConfig