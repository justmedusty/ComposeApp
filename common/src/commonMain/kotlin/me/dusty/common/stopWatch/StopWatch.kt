package me.dusty.common.stopWatch

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.coroutines.*
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*


class StopWatch {

    var timeStamp: String by mutableStateOf("00:00:000")
    private var coroutineScope = CoroutineScope(Dispatchers.Main)
    private var isActive = false
    private var timeMillis = 0L
    private var lastTimestamp = 0L

    fun start() {
        if (isActive)
            return
        coroutineScope.launch {
            lastTimestamp = System.currentTimeMillis()
            this@StopWatch.isActive = true
            while (this@StopWatch.isActive) {
                delay(10L)
                timeMillis += System.currentTimeMillis() - lastTimestamp
                lastTimestamp = System.currentTimeMillis()
                timeStamp = formatTime(timeMillis)
            }

        }
    }

    @Suppress("NewApi")
    private fun formatTime(timeMillis: Long): String {
        val localDatetime = LocalDateTime.ofInstant(
            Instant.ofEpochMilli(timeMillis),
            ZoneId.systemDefault()
        )
        val formatter = DateTimeFormatter.ofPattern(
            "mm:ss:SSS",
            Locale.getDefault()
        )
        return localDatetime.format(formatter)

    }

    fun reset() {
        coroutineScope.cancel()
        coroutineScope = CoroutineScope(Dispatchers.Main)
        timeMillis = 0L
        lastTimestamp = 0L
        timeStamp = "00:00:000"
        isActive = false
    }

    fun pause() {
        isActive = false
    }
}