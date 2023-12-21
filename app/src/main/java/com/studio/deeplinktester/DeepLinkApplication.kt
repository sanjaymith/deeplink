package com.studio.deeplinktester

import android.app.Application
import com.studio.deeplinktester.repository.DeepLinkRepository
import com.studio.deeplinktester.room.database.DeepLinkDataBase

class DeepLinkApplication : Application() {

    private val database by lazy { DeepLinkDataBase.getDatabase(this) }
    val repository by lazy { DeepLinkRepository(database.deepLinkDao()) }
}