package com.projectinventory.veggtables.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectinventory.veggtables.dto.ProductDTO;
import com.projectinventory.veggtables.entity.Product;
import com.projectinventory.veggtables.repository.AdminRepository;
import com.projectinventory.veggtables.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository pr;
	
	@Autowired
	private AdminRepository apr;

	
	public Product registrarProducto(ProductDTO productdto) {
		
		Product product= new Product();
		
		product.setName(productdto.getName());
		product.setPrice(productdto.getPrice());
		product.setQuantity(productdto.getQuantity());
		product.setCategory(productdto.getCategory());
		
		apr.findById(productdto.getIdadmin()).ifPresent(admin -> {
			product.setAdmin(admin);
			});
		
		
		return pr.save(product);
	}
	
	public List<Product> listaProducto(){
		return pr.findAll();
		
	}
	
	public Product actualizarProducto(ProductDTO productdto, Integer id) {
		
		Product productoexistente=pr.findById(id).orElse(null);
		
		if (productoexistente!=null) {
			productoexistente.setName(productdto.getName());
			productoexistente.setPrice(productdto.getPrice());
			productoexistente.setQuantity(productdto.getQuantity());
			productoexistente.setCategory(productdto.getCategory());
			
			return pr.save(productoexistente);
		}
		
		return null;
	}
	
	public void eliminarProducto(Integer id) {
		
		if (pr.existsById(id)) {
			pr.deleteById(id);
		}
		
	}
	
}
