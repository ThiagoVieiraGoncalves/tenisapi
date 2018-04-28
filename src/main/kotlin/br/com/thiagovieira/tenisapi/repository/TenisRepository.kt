package br.com.thiagovieira.tenisapi.repository

import br.com.thiagovieira.tenisapi.entity.Tenis
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TenisRepository : MongoRepository<Tenis, String> {

    fun findByModelo(modelo: String): Tenis

    fun findByMarcaContaining(marca: String): List<Tenis>

    fun findByTamanho(tamanho: Int): List<Tenis>
}