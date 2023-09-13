package com.example.iptracking.service

import com.example.iptracking.model.IpInfo

interface IpService {
    fun retrieveIpAddress(ipAddress: String): IpInfo
}