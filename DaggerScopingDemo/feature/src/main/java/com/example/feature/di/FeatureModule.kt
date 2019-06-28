package com.example.feature.di

import com.example.feature.FeatureActivityPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FeatureModule {
    @Provides
    fun provideMainActivityPresenter() : FeatureActivityPresenter
    {
        return FeatureActivityPresenter()
    }
}