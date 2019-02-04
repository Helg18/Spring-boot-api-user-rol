package com.henryleon.API.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

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
	public String eliminar(int id) {
		if(usuarioRepo.existsById(id)) {
			usuarioRepo.deleteById(id);
			return "Deleted";
		}
		return "Entity does not exists";
	}
	
//	Metodos de ordenamiento
	@Override
	public List<Usuario> orderByDate() {
		return usuarioRepo.findAll(Sort.by("fechaCreacion"));
	}
	

	@Override
	public List<Usuario> orderByRol() {
		return usuarioRepo.findAll(Sort.by("rolId"));
	}
	
	
	public List<Usuario> findByUsernameIs(String username) {
		return usuarioRepo.findByUsernameIs(username);
	}
	
}
