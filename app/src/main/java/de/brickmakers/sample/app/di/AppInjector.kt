package de.brickmakers.sample.app.di

import de.brickmakers.sample.app.AppConfigImpl
import de.brickmakers.sample.domain.di.DomainInjector

object AppInjector {
	val component: AppComponent by lazy {
		DaggerAppComponent.builder()
			.domainLayer(DomainInjector.component(AppConfigImpl))
			.build()
	}
}