package br.com.thiagovieira.tenisapi.repository

import br.com.thiagovieira.tenisapi.entity.Usuario
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository : MongoRepository<Usuario, String> {

    fun findByLoginAndSenha(login: String, senha: String): Usuario?
}