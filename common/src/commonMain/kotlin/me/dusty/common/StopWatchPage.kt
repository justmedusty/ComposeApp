package me.dusty.common

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import me.dusty.common.stopWatch.StopWatch
import me.dusty.common.stopWatch.StopWatchDisplay

import androidx.compose.material.MaterialTheme

@Composable
fun StopWatchPage() {

    MaterialTheme
    run {
        val stopWatch = remember { StopWatch() }

        StopWatchDisplay(
            formattedTime = stopWatch.timeStamp,
            onStartClick = stopWatch::start,
            onPauseClick = stopWatch::pause,
            onResetClick = stopWatch::reset

        )
    }
}
