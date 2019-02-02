package com.henryleon.API.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.henryleon.API.entity.Usuario;
import com.henryleon.API.service.jpa.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private UsuarioService serviceUsuario;
	

	@GetMapping("/usuario")
	public List<Usuario> buscarTodos(){
		return serviceUsuario.buscarTodos();
	}
	
	@PostMapping("/usuario")
	public Usuario guradar(@RequestBody Usuario usuario) {
		return serviceUsuario.guardar(usuario);
	}
	
	@PutMapping("/usuario")
	public Usuario modificar(@RequestBody Usuario usuario) {
		return serviceUsuario.guardar(usuario);
	}
	
	@DeleteMapping("/usuario")
	public String eliminar(@RequestBody Usuario usuario) {
		serviceUsuario.eliminar(usuario.getId());
		return "Deleted";
	}

	
}
