package tech.cordona.service.customer.feature.annotation

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

@Component
@Target(AnnotationTarget.CLASS)
annotation class UseCase(
	@get:AliasFor(annotation = Component::class, attribute = "value")
	val value: String = ""
)