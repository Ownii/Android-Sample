package de.brickmakers.sample.domain.utils.usecase.rx

import de.brickmakers.sample.domain.utils.usecase.UseCase
import io.reactivex.rxjava3.core.Completable


interface CompletableUseCase<P> : UseCase<Completable, P>, Scheduled {
	override fun apply(param: P): Completable = run(param)
		.subscribeOn(executionScheduler)
		.observeOn(observerScheduler)
}
