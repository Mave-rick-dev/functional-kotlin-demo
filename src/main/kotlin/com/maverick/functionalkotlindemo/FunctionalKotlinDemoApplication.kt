package com.maverick.functionalkotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FunctionalKotlinDemoApplication

fun main(args: Array<String>) {
    runApplication<FunctionalKotlinDemoApplication>(*args)
}
