package br.com.thiagovieira.tenisapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Tenis(@Id var id: String?,
                 var marca: String,
                 var modelo: String,
                 var tamanho: Int
                 ) {
//    constructor(): this("", "", "", 0, "")

}