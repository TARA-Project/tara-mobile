package com.example.tara.di

import android.content.Context
import com.example.tara.data.Repository
import com.example.tara.data.datastore.UserPreference
import com.example.tara.data.datastore.dataStore
import com.example.tara.data.retrofit.ApiConfig

object Injection {
    fun provideRepository(context: Context): Repository {
        val pref = UserPreference.getInstance(context.dataStore)
        val apiService = ApiConfig.getApiService()
        return Repository.getInstance(apiService, pref)
    }
}