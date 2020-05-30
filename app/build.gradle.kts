plugins {
	id("com.android.application")
	id("kotlin-android")
	id("kotlin-android-extensions")
	kotlin("kapt")
}

android {
	compileSdkVersion(de.brickmakers.sample.build.AndroidApp.compileVersion)
	buildToolsVersion = de.brickmakers.sample.build.AndroidApp.buildTools

	defaultConfig {
		applicationId = de.brickmakers.sample.build.AndroidApp.applicationId
		minSdkVersion(de.brickmakers.sample.build.AndroidApp.minSdk)
		targetSdkVersion(de.brickmakers.sample.build.AndroidApp.targetSdk)
		versionCode = de.brickmakers.sample.build.AndroidApp.versionCode
		versionName = de.brickmakers.sample.build.AndroidApp.versionName

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}

	buildTypes {
		getByName("release") {
			isMinifyEnabled = false
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"),
				"proguard-rules.pro"
			)
		}
	}
	lintOptions {
		disable("AllowBackup", "GoogleAppIndexingWarning", "MissingApplicationIcon")
	}
}

apply("dependencies.gradle.kts")