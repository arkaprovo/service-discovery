package com.sath.devops.service.registry

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ServiceRegistryApplication

fun main(args: Array<String>) {
    SpringApplication.run(ServiceRegistryApplication::class.java, *args)
}
