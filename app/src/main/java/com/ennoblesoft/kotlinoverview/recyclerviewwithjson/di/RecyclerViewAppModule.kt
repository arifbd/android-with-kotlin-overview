package com.ennoblesoft.kotlinoverview.recyclerviewwithjson.di

import android.content.Context
import com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.local.LocalJsonParser
import com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.repository.ContactRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RecyclerViewAppModule {
    @Singleton
    @Provides
    fun provideLocalJsonParser(@ApplicationContext context: Context) = LocalJsonParser(context)

    @Singleton
    @Provides
    fun provideContactRepository(localJsonParser: LocalJsonParser) = ContactRepository(localJsonParser)
}