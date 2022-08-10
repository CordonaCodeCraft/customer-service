package tech.cordona.service.customer.feature.common.annotation

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import tech.cordona.service.customer.feature.IntegrationTestApplication
import java.lang.annotation.Inherited

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@SpringBootTest(classes = [IntegrationTestApplication::class])
@ActiveProfiles("test")
@Inherited
annotation class IntegrationTest