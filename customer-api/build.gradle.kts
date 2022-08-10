plugins {
	id("project-conventions")
	id("kotlin-conventions")
	id("spring-conventions")
}

dependencies {
	implementation(project(":customer-model"))
	implementation("org.springframework.boot:spring-boot-starter-web")
}
