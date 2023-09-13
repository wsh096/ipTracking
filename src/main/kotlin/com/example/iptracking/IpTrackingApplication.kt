package com.example.iptracking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IpTrackingApplication

fun main(args: Array<String>) {
    runApplication<IpTrackingApplication>(*args)
}
