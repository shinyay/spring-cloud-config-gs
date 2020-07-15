package com.google.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class SpringCloudConfigGsApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudConfigGsApplication>(*args)
}
