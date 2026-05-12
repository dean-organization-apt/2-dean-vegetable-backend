package com.projectinventory.veggtables.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectinventory.veggtables.dto.AdminDTO;
import com.projectinventory.veggtables.entity.Admin;
import com.projectinventory.veggtables.repository.AdminRepository;

@Service
public class AdminService {
	
	private static final Logger log = LoggerFactory.getLogger(AdminService.class);
	
	@Autowired
	private AdminRepository ar;
	
	public Admin registrar(AdminDTO admindto) {
		
		Admin admin =new Admin();
		
		admin.setUser(admindto.getUser());
		admin.setPassword(admindto.getPassword());
		admin.setEmail(admindto.getEmail());
		admin.setStatus(true);
		
		return ar.save(admin);
		
	}
	
	public List<Admin> listarTodos(){
		return ar.findAll();
		
	}
	
	public void desactivar(Integer id) {
		
		log.info("Intentando desactivar al administrador: {} ", id);
		Admin admin=ar.findById(id).orElse(null);
		
		if(admin==null) {
			log.error("No se encontro al admin con ID: {}",id);
			return;
		}
			else {
			
		
			admin.setStatus(false);
			ar.save(admin);
			}
		}
	
	public Admin actualizar(AdminDTO admindto, Integer id) {
		
		Admin adminExistente=ar.findById(id).orElse(null);
		
		if (adminExistente!=null) {
			
			adminExistente.setUser(admindto.getUser());
			adminExistente.setPassword(admindto.getPassword());
			adminExistente.setEmail(admindto.getEmail());
			adminExistente.setStatus(admindto.getStatus());
			
			
			return ar.save(adminExistente);
			
		}
		
		log.error("No se pudo actualizar el ID {} no existe",id);
		return null;
		
		
		
		
		
		
	}
	}


