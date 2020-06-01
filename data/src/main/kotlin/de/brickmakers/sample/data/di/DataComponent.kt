package de.brickmakers.sample.data.di

import dagger.BindsInstance
import dagger.Component
import de.brickmakers.sample.data.api.Api
import de.brickmakers.sample.data.di.modules.BindModule
import de.brickmakers.sample.data.di.modules.ProvideModule
import de.brickmakers.sample.model.AppConfig


@Component(
	modules = [
		BindModule::class,
		ProvideModule::class
	]
)
@DataScope
interface DataComponent {

	@Component.Builder
	interface Builder {

		@BindsInstance
		fun with(appConfig: AppConfig): Builder

		fun build(): DataComponent
	}

	// Define your dependencies, domain needs to see here
	fun provideApi(): Api

}