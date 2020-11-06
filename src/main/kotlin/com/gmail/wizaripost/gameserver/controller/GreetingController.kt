package com.gmail.wizaripost.gameserver.controller

import com.gmail.wizaripost.gameserver.entity.Greeting
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class GreetingController {
    private val counter = AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", required = false, defaultValue = "World") name: String?): Greeting {
        return Greeting(counter.incrementAndGet(), String.format(template, name))
    }

    companion object {
        private const val template = "Hello, %s!"
    }
}
