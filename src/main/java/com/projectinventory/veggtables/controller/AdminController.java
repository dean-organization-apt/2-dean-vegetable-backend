package com.projectinventory.veggtables.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectinventory.veggtables.dto.AdminDTO;
import com.projectinventory.veggtables.entity.Admin;

import com.projectinventory.veggtables.service.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	@Autowired
	private AdminService as;

	@PostMapping("/registrar")
	public Admin registrar(@RequestBody AdminDTO admindto) {

		return as.registrar(admindto);

	}

	@GetMapping("/listar")
	public List<AdminDTO> listar() {

		return  as.listarTodos();
	}

	@PutMapping("/actualizar/{id}")
	public Admin actualizar(@RequestBody AdminDTO dto, @PathVariable Integer id) {

		return as.actualizar(dto, id);

	}
	
	@DeleteMapping("/desactivar/{id}")
	public void desactivar(@PathVariable Integer id) {
		
	 as.desactivar(id);
		
	}

}
