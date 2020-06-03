import de.brickmakers.sample.build.AndroidApp

plugins {
	id("com.android.application")
	id("kotlin-android")
	id("kotlin-android-extensions")
	kotlin("kapt")
}

android {
	compileSdkVersion(AndroidApp.compileVersion)
	buildToolsVersion = AndroidApp.buildTools

	defaultConfig {
		applicationId = AndroidApp.applicationId
		minSdkVersion(AndroidApp.minSdk)
		targetSdkVersion(AndroidApp.targetSdk)
		versionCode = AndroidApp.versionCode
		versionName = AndroidApp.versionName

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

	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
}

apply("dependencies.gradle.kts")