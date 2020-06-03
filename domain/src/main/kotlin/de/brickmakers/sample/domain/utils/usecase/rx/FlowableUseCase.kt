package de.brickmakers.sample.domain.utils.usecase.rx

import de.brickmakers.sample.domain.utils.usecase.UseCase
import io.reactivex.rxjava3.core.Flowable


interface FlowableUseCase<R, P> : UseCase<Flowable<R>, P>, Scheduled {
	override fun apply(param: P): Flowable<R> = run(param)
		.subscribeOn(executionScheduler)
		.observeOn(observerScheduler)
}
