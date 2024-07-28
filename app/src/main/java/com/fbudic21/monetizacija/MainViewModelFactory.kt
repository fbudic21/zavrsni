package com.fbudic21.monetizacija

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.fbudic21.monetizacija.utils.AdManager

class MainViewModelFactory(private val adManager: RewardedAdManager) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MainViewModel(adManager) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}