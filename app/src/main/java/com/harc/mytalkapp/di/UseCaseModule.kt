package com.harc.mytalkapp.di

import android.content.Context
import com.harc.mytalkapp.domain.useCase.impl.PlaySoundUseCaseImpl
import com.harc.mytalkapp.domain.useCase.interfaces.PlaySoundUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun providePlaySoundUseCase(@ApplicationContext context: Context): PlaySoundUseCase {
        return PlaySoundUseCaseImpl(context)
    }

}