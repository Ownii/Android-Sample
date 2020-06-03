package de.brickmakers.sample.domain.utils.usecase.rx

import de.brickmakers.sample.domain.utils.usecase.UseCase
import io.reactivex.rxjava3.core.Observable


interface ObservableUseCase<R, P> : UseCase<Observable<R>, P>, Scheduled {
	override fun apply(param: P): Observable<R> = run(param)
		.subscribeOn(executionScheduler)
		.observeOn(observerScheduler)
}
