import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
	id("project-conventions")
	id("kotlin-conventions")
	id("spring-conventions")
}

dependencies {
	implementation(project(":customer-api"))
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("mysql:mysql-connector-java:8.0.29")
}

val bootJar: BootJar by tasks
bootJar.enabled = true