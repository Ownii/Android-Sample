import de.brickmakers.sample.build.Dependencies

val implementation by configurations
val testImplementation by configurations
val kapt by configurations

dependencies {
	implementation(project(":model"))

	with(Dependencies) {
		listOf(
			kotlin,
			dagger
		)
	}.forEach { implementation(it) }

	with(Dependencies) {
		listOf(
			daggerCompiler
		)
	}.forEach { kapt(it) }

	with(Dependencies.Testing) {
		listOf(
			junit,
			mockito,
			mockitoKotlin
		)
	}.forEach { testImplementation(it) }

}