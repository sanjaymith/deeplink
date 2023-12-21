package com.studio.deeplinktester.repository

import androidx.annotation.WorkerThread
import com.studio.deeplinktester.room.dao.DeepLinkDao
import com.studio.deeplinktester.room.model.DeepLinkData
import kotlinx.coroutines.flow.Flow

class DeepLinkRepository(private val deepLinkDao: DeepLinkDao) {

    val allDeepLinks: Flow<List<DeepLinkData>> = deepLinkDao.getAllDeepLinks()

    @WorkerThread
    suspend fun insert(deepLinkData: DeepLinkData) {
        deepLinkDao.insert(deepLinkData)
    }

    @WorkerThread
    suspend fun delete(deepLink: String) {
        deepLinkDao.delete(deepLink)
    }
}