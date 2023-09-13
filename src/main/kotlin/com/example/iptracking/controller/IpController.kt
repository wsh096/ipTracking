package com.example.iptracking.controller

import com.example.iptracking.service.IpService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class IpController(private val ipService: IpService, private val request: HttpServletRequest) {
    @GetMapping("/get-ip")
    fun getIP(): String {
        val ipInfo = ipService.retrieveIpAddress(request.remoteAddr)
        println("Your IP is: ${ipInfo.ipAddress}")
        return "Your IP is: ${ipInfo.ipAddress}"
    }
}