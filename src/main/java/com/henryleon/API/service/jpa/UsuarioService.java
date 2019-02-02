package com.henryleon.API.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henryleon.API.entity.Rol;
import com.henryleon.API.entity.Usuario;
import com.henryleon.API.repository.UsuarioRepository;
import com.henryleon.API.service.UsuarioServiceInterface;

@Service
public class UsuarioService implements UsuarioServiceInterface {
	
	@Autowired
	private UsuarioRepository usuarioRepo;

	@Override
	public List<Usuario> buscarTodos() {
		return usuarioRepo.findAll();
	}

	public Usuario guardar(Usuario usuario) {
		usuarioRepo.save(usuario);
		return usuario;
	}

	@Override
	public void eliminar(int id) {
		usuarioRepo.deleteById(id);
	}
	
	
}
