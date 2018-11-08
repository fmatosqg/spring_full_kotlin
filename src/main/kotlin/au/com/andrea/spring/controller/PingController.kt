package au.com.andrea.spring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
class PingController {


    @GetMapping("/ping", produces = arrayOf("application/xml", "application/json"))
    @ResponseBody
    fun ping(): Ping {
        return Ping()

    }
}


data class Ping(val ping: String = "pong")

