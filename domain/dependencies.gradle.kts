import de.brickmakers.sample.build.Dependencies

val implementation by configurations
val testImplementation by configurations

dependencies {
	implementation(project(":model"))
	implementation(project(":data"))

	with(Dependencies) {
		listOf(
			kotlin
		)
	}.forEach { implementation(it) }

	with(Dependencies.Testing) {
		listOf(
			junit,
			mockito,
			mockitoKotlin
		)
	}.forEach { testImplementation(it) }

}