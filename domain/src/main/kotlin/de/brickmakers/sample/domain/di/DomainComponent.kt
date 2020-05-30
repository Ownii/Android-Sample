package de.brickmakers.sample.domain.di

import dagger.BindsInstance
import dagger.Component
import de.brickmakers.sample.data.di.DataComponent
import de.brickmakers.sample.data.di.modules.BindModule
import de.brickmakers.sample.data.di.modules.ProvideModule
import de.brickmakers.sample.model.AppConfig


@Component(
	modules = [
		BindModule::class,
		ProvideModule::class
	],
	dependencies = [
		DataComponent::class
	]
)
@DomainScope
interface DomainComponent : DomainLayer {

	@Component.Builder
	interface Builder {

		@BindsInstance
		fun with(appConfig: AppConfig): Builder

		fun with(dataComponent: DataComponent): Builder

		fun build(): DomainComponent
	}
}