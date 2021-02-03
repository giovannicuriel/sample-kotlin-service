package br.giovanni.kotlin.sampleservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SampleServiceApplication

fun main(args: Array<String>) {
  runApplication<SampleServiceApplication>(*args);
}