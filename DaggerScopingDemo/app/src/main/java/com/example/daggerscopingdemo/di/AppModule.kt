package com.example.daggerscopingdemo.di

import com.example.daggerscopingdemo.services.MainActivityPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule
{
    @Provides
    fun provideMainActivityPresenter() : MainActivityPresenter
    {
        return MainActivityPresenter()
    }
}