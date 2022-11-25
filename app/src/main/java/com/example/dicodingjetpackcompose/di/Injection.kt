package com.example.dicodingjetpackcompose.di

import com.example.dicodingjetpackcompose.data.RewardRepository

object Injection {
    fun provideRepository(): RewardRepository {
        return RewardRepository.getInstance()
    }
}