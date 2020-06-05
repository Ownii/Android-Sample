# Android-Sample
This sample project tries to demonstrate the clean architecture by Robert C. Martin.

So this project is seperated into 4 modules.
- data
- domain
- app (presentation
- model

There are also several branches where different approaches are accomplished.

The README in each branch contains information about whats going on there, but basicly:
dagger - Dependency Injection with dagger (AppComponent, DomainComponent, DataComponent)
daggerRetrofit - dagger + Retrofit in data layer to access an api
daggerRetrofitRxUseCase - daggerRetrofit + UseCase Pattern with RxJava in domain layer

As this sample project seperates the applications layers into modules, it may be not the best approach if you know your project in gonne be large and you have to create feature-modules.

Of cause this sample is just a demonstration, you can change it in every way you want.

Feel free to create pull requests with different implementations/patterns/approaches.
