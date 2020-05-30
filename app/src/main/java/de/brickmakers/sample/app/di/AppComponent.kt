package de.brickmakers.sample.app.di

import dagger.Component
import de.brickmakers.sample.app.di.modules.BindModule
import de.brickmakers.sample.app.di.modules.ProvideModule
import de.brickmakers.sample.domain.di.DomainLayer

@Component(
	modules = [
		BindModule::class,
		ProvideModule::class
	],
	dependencies = [
		DomainLayer::class
		// we can not depend on DomainComponent, because dagger checks for scope cycles
		// as DataComponent could be a part of the cycle dagger tries to check there
		// but as app does not depend on data, dagger fails trying to resolve DataComponent
		// By depending on a basic interface (not component), the circle check stops there
		// So be careful and always use the correct scope
		// https://github.com/google/dagger/issues/970#issuecomment-492864525
	]
)
@AppScope
interface AppComponent {

}