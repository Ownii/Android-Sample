package de.brickmakers.sample.domain.usecases

import de.brickmakers.sample.domain.di.ExecutionScheduler
import de.brickmakers.sample.domain.di.ObserverScheduler
import de.brickmakers.sample.domain.utils.usecase.rx.SingleUseCase
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class TestUseCase @Inject constructor(
	@ExecutionScheduler override val executionScheduler: Scheduler,
	@ObserverScheduler override val observerScheduler: Scheduler
) : SingleUseCase<Boolean, String> {
	override fun run(param: String): Single<Boolean> {
		TODO("Not yet implemented")
	}

}