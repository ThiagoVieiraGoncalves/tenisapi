package br.com.thiagovieira.tenisapi.controller

import br.com.thiagovieira.tenisapi.entity.Tenis
import br.com.thiagovieira.tenisapi.service.TenisService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tenis")
class TenisController {

    @Autowired
    lateinit var tenisService: TenisService

    @GetMapping
    fun buscarTodos(): List<Tenis> {
        return tenisService.buscarTodosTenis()
    }

    @PostMapping
    fun salvar(@RequestBody tenis: Tenis) {
        tenisService.salvar(tenis)
    }

    @GetMapping("/{id}")
    fun buscaPeloId(@PathVariable("id") id: String) {
        tenisService.buscarTenisPorId(id)
    }

    @DeleteMapping("/{id}")
    fun remover(@PathVariable("id") id: String) {
        tenisService.remover(id)
    }
}