package br.com.thiagovieira.tenisapi.service

import br.com.thiagovieira.tenisapi.entity.Tenis
import br.com.thiagovieira.tenisapi.repository.TenisRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TenisService {

    @Autowired
    lateinit var tenisRepository: TenisRepository

    fun buscarTodosTenis(): List<Tenis> {
        return tenisRepository.findAll()
    }

    fun buscarTenisPorId(id: String): Tenis {
        return tenisRepository.findById(id).get()
    }

    fun buscarTenisPorMarca(marca: String): List<Tenis> {
        return tenisRepository.findByMarcaContaining(marca)
    }

    fun buscarTenisPorModelo(modelo: String): Tenis {
        return tenisRepository.findByModelo(modelo)
    }

    fun buscarTenisPorTamanho(tamanho: Int): List<Tenis> {
        return tenisRepository.findByTamanho(tamanho)
    }

    fun salvar(tenis: Tenis) {
        tenisRepository.save(tenis)
    }

    fun remover(id: String) {
        val tenis = tenisRepository.findById(id).get()
        tenisRepository.delete(tenis)
    }
}
