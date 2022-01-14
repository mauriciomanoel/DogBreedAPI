package com.mauricio.dogapichallenger.di.component

import android.app.Application
import com.mauricio.dogapichallenger.AndroidDogApiApplication
import com.mauricio.dogapichallenger.di.module.ActivityBindings
import com.mauricio.dogapichallenger.di.module.AppModule
import com.mauricio.dogapichallenger.di.module.FragmentBindings
import com.mauricio.dogapichallenger.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class, NetworkModule::class, ActivityBindings::class, FragmentBindings::class, AndroidInjectionModule::class])
interface AppComponent : AndroidInjector<AndroidDogApiApplication> {
    fun inject(application: Application)
//    fun inject(viewModel: DormViewModel)
//    fun inject(viewModel: CartViewModel)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun app(application: Application): Builder
        fun build(): AppComponent
    }
}