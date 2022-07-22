package tech.cordona.customer.persistence.common.annotation

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import tech.cordona.customer.persistence.IntegrationTestApplication
import java.lang.annotation.Inherited

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@SpringBootTest(classes = [IntegrationTestApplication::class])
@ActiveProfiles("test")
@Inherited
annotation class IntegrationTest