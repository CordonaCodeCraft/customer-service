plugins {
	id("project-conventions")
	id("kotlin-conventions")
	id("spring-conventions")
}

dependencies {
	implementation(project(":customer-model"))
	implementation("tech.cordona:relational-entity-support:0.0.5-SNAPSHOT")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("mysql:mysql-connector-java:8.0.29")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}
