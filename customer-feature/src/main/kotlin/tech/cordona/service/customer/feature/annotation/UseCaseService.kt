package tech.cordona.service.customer.feature.annotation

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Service

@Service
@Target(AnnotationTarget.CLASS)
annotation class UseCaseService(
	@get:AliasFor(annotation = Service::class, attribute = "value")
	val value: String = ""
)
