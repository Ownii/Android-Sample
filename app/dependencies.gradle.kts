import de.brickmakers.sample.build.Dependencies

val implementation by configurations
val testImplementation by configurations
val androidTestImplementation by configurations

dependencies {

	implementation(project(":model"))
	implementation(project(":domain"))

	with(Dependencies) {
		listOf(
			kotlin,
			coreKtx,
			appcompat,
			constraintlayout
		)
	}.forEach { implementation(it) }

	with(Dependencies.Testing) {
		listOf(
			junit,
			mockito,
			mockitoKotlin
		)
	}.forEach { testImplementation(it) }

	with(Dependencies.Testing.Android) {
		listOf(
			junit,
			espresso
		)
	}.forEach { androidTestImplementation(it) }

}