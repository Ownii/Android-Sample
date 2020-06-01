package de.brickmakers.sample.data.di.modules

import dagger.Module
import dagger.Provides
import de.brickmakers.sample.data.api.Api
import de.brickmakers.sample.data.api.buildApi
import de.brickmakers.sample.data.di.DataScope
import de.brickmakers.sample.model.AppConfig

@Module
class ProvideModule {
	@DataScope
	@Provides
	fun provideApi(appConfig: AppConfig): Api =
		buildApi(appConfig)
}