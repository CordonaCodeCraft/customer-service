plugins {
	id("project-conventions")
	id("kotlin-conventions")
	id("spring-conventions")
}

dependencies {
	implementation("tech.cordona:relational-entity-support:0.0.9-SNAPSHOT")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}