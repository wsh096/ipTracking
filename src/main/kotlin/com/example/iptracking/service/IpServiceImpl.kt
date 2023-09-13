package com.example.iptracking.service

import com.example.iptracking.model.IpInfo
import org.springframework.stereotype.Service


@Service
class IpServiceImpl : IpService {
    override fun retrieveIpAddress(ipAddress: String) = IpInfo(ipAddress)
}