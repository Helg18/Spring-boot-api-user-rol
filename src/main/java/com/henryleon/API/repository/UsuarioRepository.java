package com.henryleon.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.henryleon.API.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
