package de.brickmakers.sample.domain.utils.usecase.rx

import de.brickmakers.sample.domain.utils.usecase.UseCase
import io.reactivex.rxjava3.core.Single


interface SingleUseCase<R, P> : UseCase<Single<R>, P>, Scheduled {
	override fun apply(param: P): Single<R> = run(param)
		.subscribeOn(executionScheduler)
		.observeOn(observerScheduler)
}
