package com.henryleon.API.service;

import java.util.List;
import com.henryleon.API.entity.Rol;

public interface RolServiceInterface {
	
	// Listar
	List<Rol> buscarTodos();
	
	// Guardar
	Rol guardar(Rol rol);	
}
