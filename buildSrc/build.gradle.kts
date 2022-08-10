plugins {
	`kotlin-dsl`
}

repositories {
	mavenCentral()
}

val kotlinVersion = "1.6.21"

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
	implementation("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
	implementation("org.jetbrains.kotlin:kotlin-noarg:$kotlinVersion")
	implementation("io.spring.gradle:dependency-management-plugin:1.0.11.RELEASE")
	implementation("org.springframework.boot:spring-boot-gradle-plugin:2.6.4")
}