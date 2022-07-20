import java.net.URI

group = "tech.cordona"
version = "1.0-SNAPSHOT"

val cordonaRepoReadUrl: String by project

repositories {
	mavenCentral()
	maven {
		url = URI(cordonaRepoReadUrl)
	}
}