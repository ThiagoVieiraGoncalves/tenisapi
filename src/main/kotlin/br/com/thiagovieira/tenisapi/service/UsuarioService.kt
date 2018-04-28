package br.com.thiagovieira.tenisapi.service

import br.com.thiagovieira.tenisapi.entity.Usuario
import br.com.thiagovieira.tenisapi.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsuarioService {

    @Autowired
    lateinit var usuarioRepository: UsuarioRepository

    fun buscarPorLoginSenha(login: String, senha: String): Usuario? {
        return usuarioRepository.findByLoginAndSenha(login, senha)
    }

    fun salvar(usuario: Usuario) {
        usuarioRepository.save(usuario)
    }

}
