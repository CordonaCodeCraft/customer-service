import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
	id("project-conventions")
	id("kotlin-conventions")
	id("spring-conventions")
}

extra["springCloudVersion"] = "2021.0.3"

dependencies {
	implementation(project(":customer-api"))
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("mysql:mysql-connector-java:8.0.30")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
}

repositories {
	mavenCentral()
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
	}
}

val bootJar: BootJar by tasks
bootJar.enabled = true