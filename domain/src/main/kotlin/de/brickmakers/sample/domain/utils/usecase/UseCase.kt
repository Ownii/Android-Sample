package de.brickmakers.sample.domain.utils.usecase

import java.util.function.Function

interface UseCase<R, P> : Function<P, R> {
	override fun apply(param: P): R = run(param)

	fun run(param: P): R
}
