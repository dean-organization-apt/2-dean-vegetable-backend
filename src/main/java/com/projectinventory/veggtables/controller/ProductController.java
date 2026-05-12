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

import com.projectinventory.veggtables.dto.ProductDTO;
import com.projectinventory.veggtables.entity.Product;
import com.projectinventory.veggtables.service.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	
@Autowired	
private	ProductService ps;


@PostMapping("/registrarproducto")
public Product registrarProducto(@RequestBody ProductDTO productodto) {
	
	return ps.registrarProducto(productodto);
	
}

@GetMapping("/listaproducto")
public List<Product> listarProducto(){
	return ps.listaProducto();
}

@PutMapping("/actualizarproducto/{id}")
public Product actualizarProducto(@RequestBody ProductDTO productdto, @PathVariable Integer id) {
	
	return ps.actualizarProducto(productdto, id);
}
	
@DeleteMapping("/eliminarproducto/{id}")
public void eliminarProducto(@PathVariable Integer id) {
	
	ps.eliminarProducto(id);
}

}
