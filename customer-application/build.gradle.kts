import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
	id("project-conventions")
	id("kotlin-conventions")
	id("spring-conventions")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
}

val bootJar: BootJar by tasks
bootJar.enabled = true