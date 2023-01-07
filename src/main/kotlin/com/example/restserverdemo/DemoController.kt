package com.example.restserverdemo

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    var payload: Payload? = null

    @GetMapping("get")
    fun get() = payload

    @PostMapping("set", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun set(@RequestBody payload: Payload) {
        this.payload = payload
    }
}