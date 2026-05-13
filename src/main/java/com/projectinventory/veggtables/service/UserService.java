package com.projectinventory.veggtables.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectinventory.veggtables.dto.UserDTO;
import com.projectinventory.veggtables.entity.User;
import com.projectinventory.veggtables.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository ur;
	
	
	public User crearUsuario(UserDTO userdto) {
		
		User user=new User();
		
		user.setUsername(userdto.getUsername());
		user.setPassword(userdto.getPassword());
		user.setEmail(userdto.getEmail());
		user.setStatus(true);
		
		return ur.save(user);
		
	}
	
	public List<User> listarUsuarios(){
		
		return ur.findAll();
		
	}
	
	public User actualizarUsuario(UserDTO userdto,Integer id) {
		
		User usuarioexistente=ur.findById(id).orElse(null);
		
		if(usuarioexistente!=null) {
			
			usuarioexistente.setUsername(userdto.getUsername());
			usuarioexistente.setPassword(userdto.getPassword());
			usuarioexistente.setEmail(userdto.getEmail());
			usuarioexistente.setStatus(userdto.getStatus());
			
			return ur.save(usuarioexistente);
		}
		
		return null;
	}
	
	public void eliminarUsuario(Integer id) {
		
		if(ur.existsById(id));
		ur.deleteById(id);
		
	}
	
	
	public void desactivarUsuario(Integer id) {
		User usuario=ur.findById(id).orElse(null);
		
		if(usuario!=null) {
			usuario.setStatus(false);
			
			ur.save(usuario);
			
		}
	}

}
