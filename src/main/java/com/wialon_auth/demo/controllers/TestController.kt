package com.wialon_auth.demo.controllers

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.context.request.async.DeferredResult
import java.util.concurrent.ForkJoinPool

@RestController()
@RequestMapping(value = ["/auth_test"])
class TestController {

    val LOG = LoggerFactory.getLogger(TestController::class.java)

    @PostMapping(value = ["/"])
    open fun billingTest(@RequestBody authResponse: String) {
        LOG.info(authResponse)
    }

}