plugins {
	id("project-conventions")
	id("kotlin-conventions")
	id("spring-conventions")
}

dependencies {
	implementation(project(":customer-model"))
	implementation(project(":customer-api"))
	implementation("tech.cordona:relational-entity-support:0.0.10-SNAPSHOT")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("mysql:mysql-connector-java:8.0.29")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
	testImplementation("com.github.javafaker:javafaker:1.0.2")
	testImplementation("org.yaml:snakeyaml:1.28")
	testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
}