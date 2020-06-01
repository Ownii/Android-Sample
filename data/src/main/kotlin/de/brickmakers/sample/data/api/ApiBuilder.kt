package de.brickmakers.sample.data.api

import de.brickmakers.sample.model.AppConfig
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

fun buildApi(appConfig: AppConfig): Api {
	return Retrofit.Builder()
		.baseUrl(appConfig.apiUrl)
		.addConverterFactory(MoshiConverterFactory.create())
		.build().create(Api::class.java)
}