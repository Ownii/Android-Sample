package de.brickmakers.sample.domain.utils.usecase.rx

import io.reactivex.rxjava3.core.Scheduler


interface Scheduled {
	val executionScheduler: Scheduler
	val observerScheduler: Scheduler
}