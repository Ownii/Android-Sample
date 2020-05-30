package de.brickmakers.sample.data.di

import de.brickmakers.sample.model.AppConfig

object DataInjector {
	fun component(appConfig: AppConfig): DataComponent {
		return DaggerDataComponent.builder()
			.with(appConfig)
			.build()
	}
}