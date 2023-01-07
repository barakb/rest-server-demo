package com.example.restserverdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestServerDemoApplication

fun main(args: Array<String>) {
	runApplication<RestServerDemoApplication>(*args)
}
