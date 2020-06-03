package de.brickmakers.sample.domain.di

import dagger.Module
import dagger.Provides
import io.reactivex.rxjava3.core.Scheduler

@Module
class SchedulersModule(
	private val executionScheduler: Scheduler,
	private val observerScheduler: Scheduler
) {

	@Provides
	@ExecutionScheduler
	fun provideExecutionScheduler(): Scheduler = executionScheduler

	@Provides
	@ObserverScheduler
	fun provideObserverScheduler(): Scheduler = observerScheduler
}