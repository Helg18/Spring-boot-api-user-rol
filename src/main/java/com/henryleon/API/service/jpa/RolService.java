package com.henryleon.API.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henryleon.API.entity.Rol;
import com.henryleon.API.repository.RolRepository;
import com.henryleon.API.service.RolServiceInterface;

@Service
public class RolService implements RolServiceInterface {

	@Autowired
	private RolRepository rolRepo;
	
	public List<Rol> buscarTodos() {
		return rolRepo.findAll();
	}

	public Rol guardar(Rol rol) {
		rolRepo.save(rol);
		return rol;
	}

}
