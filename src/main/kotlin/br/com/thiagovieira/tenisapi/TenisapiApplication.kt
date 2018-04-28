package br.com.thiagovieira.tenisapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TenisapiApplication

fun main(args: Array<String>) {
    runApplication<TenisapiApplication>(*args)
}
