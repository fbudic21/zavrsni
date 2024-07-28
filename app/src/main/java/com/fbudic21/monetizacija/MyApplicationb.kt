package com.fbudic21.monetizacija

import android.app.Activity
import android.app.Application
import android.app.Application.ActivityLifecycleCallbacks
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ProcessLifecycleOwner
import com.fbudic21.monetizacija.utils.AppOpenAdManager
import com.google.android.gms.ads.*
import java.util.*

const val LOG_TAG = "AppOpenAdManager"
const val AD_UNIT_ID = "ca-app-pub-3940256099942544/9257395921"

class MyApplicationb : Application() /*,ActivityLifecycleCallbacks*//*, LifecycleObserver */{
    var appOpenAdManager: AppOpenAdManager? = null
    private var currentActivity: Activity? = null
    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(
            this
        ) { }
        //ProcessLifecycleOwner.get().lifecycle.addObserver(this)
        appOpenAdManager = AppOpenAdManager(this)
    }

    //@OnLifecycleEvent(Lifecycle.Event.ON_START)
    /*fun onMoveToForeground() {
        if (currentActivity != null) {
            appOpenAdManager!!.showAdIfAvailable(currentActivity!!)
        }
    }*/

    /*override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {}
    override fun onActivityStarted(activity: Activity) {
        /*if (!appOpenAdManager!!.isShowingAd) {
            currentActivity = activity
        }*/
    }

    override fun onActivityResumed(activity: Activity) {}
    override fun onActivityStopped(activity: Activity) {}
    override fun onActivityPaused(activity: Activity) {}
    override fun onActivitySaveInstanceState(activity: Activity, bundle: Bundle) {}
    override fun onActivityDestroyed(activity: Activity) {}*/
}