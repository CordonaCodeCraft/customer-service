plugins {
	kotlin("plugin.spring") version "1.6.21"
	id("project-conventions")
	id("kotlin-conventions")
	id("spring-conventions")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
}