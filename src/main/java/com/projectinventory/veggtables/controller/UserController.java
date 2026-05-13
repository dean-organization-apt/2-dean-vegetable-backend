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

import com.projectinventory.veggtables.dto.UserDTO;
import com.projectinventory.veggtables.entity.User;
import com.projectinventory.veggtables.service.UserService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
        @Autowired
	private UserService usc;
        
       @PostMapping("/crearusuario")
        public User crearUsuario(@RequestBody UserDTO userdto) {
        	
        	
        	return usc.crearUsuario(userdto);
        	
        }
        
        @GetMapping("/listausuario")
        public List<User> listarUsuario(){
        	
        	return usc.listarUsuarios();
        }
        
	@PutMapping("/actualizarusuario/{id}")
        public User actualizarUsuario(@RequestBody UserDTO userdto,@PathVariable Integer id) {
        	return usc.actualizarUsuario(userdto, id);
        	
        }
	
	@DeleteMapping("/eliminarusuario/{id}")
	public void eliminarUsuario(@PathVariable Integer id) {
		
		usc.eliminarUsuario(id);
		
	}
	
	@DeleteMapping("/desactivarusuario/{id}")
	public void desactivarUsuario(@PathVariable Integer id) {
		usc.desactivarUsuario(id);
		
	}
        
        
}
