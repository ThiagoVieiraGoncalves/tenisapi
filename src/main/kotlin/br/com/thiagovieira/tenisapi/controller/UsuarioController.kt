package br.com.thiagovieira.tenisapi.controller

import br.com.thiagovieira.tenisapi.entity.Usuario
import br.com.thiagovieira.tenisapi.service.UsuarioService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usuario")
class UsuarioController {

    @Autowired
    lateinit var usuarioService: UsuarioService

    @PostMapping("/login")
    fun login(@RequestBody usuario: Usuario): Usuario? {
        return usuarioService.buscarPorLoginSenha(usuario.login, usuario.senha)
    }

    @PostMapping
    fun salvar(@RequestBody usuario: Usuario) {
        usuarioService.salvar(usuario)
    }
}