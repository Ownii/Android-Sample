package de.brickmakers.sample.app

import de.brickmakers.sample.model.AppConfig

object AppConfigImpl : AppConfig {
	override val isRelease: Boolean
		get() = !BuildConfig.DEBUG

}