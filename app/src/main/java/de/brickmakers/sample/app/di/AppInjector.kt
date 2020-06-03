package de.brickmakers.sample.app.di

import de.brickmakers.sample.app.AppConfigImpl
import de.brickmakers.sample.domain.di.DomainInjector
import de.brickmakers.sample.domain.di.SchedulersModule
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

object AppInjector {
	private val domainLayer by lazy {
		DomainInjector.component(
			AppConfigImpl,
			SchedulersModule(
				executionScheduler = Schedulers.io(),
				observerScheduler = AndroidSchedulers.mainThread()
			)
		)
	}

	val component: AppComponent by lazy {
		DaggerAppComponent.builder()
			.domainLayer(domainLayer)
			.build()
	}
}