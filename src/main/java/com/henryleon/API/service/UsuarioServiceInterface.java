package com.henryleon.API.service;

import java.util.List;
import com.henryleon.API.entity.Usuario;

public interface UsuarioServiceInterface {
	
	// Listar
	List<Usuario> buscarTodos();
	
	// Guardar
	Usuario guardar(Usuario usuario);	
	
	// Eliminar
	String eliminar(int id);

	// All users Order by date
	List<Usuario> orderByDate();

	// All user sort by rol
	List<Usuario> orderByRol();
	

}