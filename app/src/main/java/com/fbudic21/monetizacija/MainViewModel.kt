package com.fbudic21.monetizacija

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fbudic21.monetizacija.utils.AdManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel(private val adManager: RewardedAdManager) : ViewModel() {
    private val _coins = MutableStateFlow(10)
    val coins: StateFlow<Int> = _coins

    fun showRewardedAd() {
        adManager.showAd { rewardAmount ->
            viewModelScope.launch {
                _coins.value += rewardAmount
            }
        }
    }
}