import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
	id("io.spring.dependency-management")
	id("org.springframework.boot")
	id("org.jetbrains.kotlin.plugin.spring")
	id("org.jetbrains.kotlin.plugin.jpa")
}

allOpen {
	annotation("javax.persistence.Entity")
	annotation("javax.persistence.MappedSuperclass")
	annotation("javax.persistence.Embeddable")
}

val bootJar: BootJar by tasks
bootJar.enabled = false

val jar: Jar by tasks
jar.enabled = true