package com.fbudic21.monetizacija

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.fbudic21.monetizacija.ui.theme.MonetizacijaTheme
import com.fbudic21.monetizacija.utils.AppOpenAdManager
import com.google.android.gms.ads.MobileAds

class AppOpenActivity : ComponentActivity() {

    private lateinit var appOpenAdManager: AppOpenAdManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MonetizacijaTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Column(modifier = Modifier.fillMaxSize()) {
                            Spacer(modifier = Modifier.weight(1f))
                            AdMobBanner(unitId = "ca-app-pub-3940256099942544/9214589741")
                        }
                    }
                }
            }
        }
        appOpenAdManager = (application as MyApplicationb).appOpenAdManager!!
        MobileAds.initialize(this) {}
        appOpenAdManager.showAdIfAvailable(this)
    }
}