package com.henryleon.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henryleon.API.entity.Rol;
import com.henryleon.API.service.jpa.RolService;

@RestController
@RequestMapping("/api")
public class RolController {
	
	@Autowired
	private RolService serviceRol;
	
	@GetMapping("/rol")
	public List<Rol> buscarTodos(){
		return serviceRol.buscarTodos();
	}
	
	@PostMapping("/rol")
	public Rol guradar(@RequestBody Rol rol) {
		return serviceRol.guardar(rol);
	}
	

}
