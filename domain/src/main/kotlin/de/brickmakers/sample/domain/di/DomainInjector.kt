package de.brickmakers.sample.domain.di

import de.brickmakers.sample.data.di.DataInjector
import de.brickmakers.sample.model.AppConfig

object DomainInjector {

	fun component(appConfig: AppConfig): DomainLayer {
		return DaggerDomainComponent.builder()
			.with(appConfig)
			.with(DataInjector.component(appConfig))
			.build()
	}

}