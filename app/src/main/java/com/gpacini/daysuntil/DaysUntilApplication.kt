package com.gpacini.daysuntil

import android.app.Application
import android.content.Context
import android.content.Intent
import com.gpacini.daysuntil.data.ImageHelper
import com.gpacini.daysuntil.data.model.Event
import com.gpacini.daysuntil.ui.activity.EventActivity
import com.nostra13.universalimageloader.core.ImageLoader
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration

/**
 * Created by gavinpacini on 10/10/15.
 */
class DaysUntilApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(this));

        //Set path to store cropped and compressed images
        val appPath = this.filesDir.absolutePath
        ImageHelper.getInstance().init("${appPath}/images")
    }
}