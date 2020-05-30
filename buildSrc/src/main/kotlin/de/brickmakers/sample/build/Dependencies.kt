package de.brickmakers.sample.build

private object Versions {
	val kotlin = "1.3.72"
	val coreKtx = "1.3.0"
	val appcompat = "1.1.0"
	val constraintlayout = "1.1.3"

	object Testing {
		val junit = "4.13"
		val mockito = "3.3.3"
		val mockitoKotlin = "2.2.0"

		object Android {
			val junit = "1.1.1"
			val espresso = "3.2.0"
		}
	}
}

object Dependencies {

	val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
	val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
	val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
	val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"

	object Testing {

		val junit = "junit:junit:${Versions.Testing.junit}"
		val mockito = "org.mockito:mockito-core:${Versions.Testing.mockito}"
		val mockitoKotlin =
			"com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.Testing.mockitoKotlin}"

		object Android {
			val junit = "androidx.test.ext:junit:${Versions.Testing.Android.junit}"
			val espresso =
				"androidx.test.espresso:espresso-core:${Versions.Testing.Android.espresso}"
		}
	}
}