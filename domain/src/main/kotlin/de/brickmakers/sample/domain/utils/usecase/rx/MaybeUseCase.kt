package de.brickmakers.sample.domain.utils.usecase.rx

import de.brickmakers.sample.domain.utils.usecase.UseCase
import io.reactivex.rxjava3.core.Maybe


interface MaybeUseCase<R, P> : UseCase<Maybe<R>, P>, Scheduled {
	override fun apply(param: P): Maybe<R> = run(param)
		.subscribeOn(executionScheduler)
		.observeOn(observerScheduler)
}
