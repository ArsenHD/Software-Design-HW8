package ru.itmo.sd.clock.time

import java.time.Instant

interface Clock {
    fun now(): Instant
}