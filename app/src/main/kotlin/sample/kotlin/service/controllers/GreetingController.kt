package br.giovanni.kotlin.sampleservice.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

import br.giovanni.kotlin.sampleservice.models.Greeting

@RestController
class GreetingController {
  val counter = AtomicLong()

  @GetMapping("/greeting")
  fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
    Greeting(counter.incrementAndGet(), "Hello, $name")
}