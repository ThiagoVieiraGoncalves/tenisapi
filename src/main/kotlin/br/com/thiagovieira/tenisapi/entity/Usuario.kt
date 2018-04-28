package br.com.thiagovieira.tenisapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Usuario(@Id var id: String?,
                   var nome: String?,
                   var login: String,
                   var senha: String
                 ) {
//    constructor(): this("", "", "", 0, "")

}