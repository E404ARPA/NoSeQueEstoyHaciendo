package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.beta.producto;


@RestController
public class ProductoController {

	@GetMapping("/producto")
	public List<producto> allProducts() {
		List<producto> listReturn = new ArrayList<producto>();
		listReturn.add(new producto("0", "A", 13.37));
		listReturn.add(new producto("1", "B", 13.37));
		listReturn.add(new producto("2", "C", 13.37));
		listReturn.add(new producto("3", "D", 13.37));
		
		return listReturn;
	}
	
	@GetMapping("prodcuto/{id}")
	public producto getProd(@PathVariable String id) {
		return new producto(id, "uwu", 42.0);
	}
	
	@PostMapping("/prodcuto")
	public String postProd(@RequestBody producto newProd) {
		return null;
	}
	
	@PutMapping("/prodcuto")
	public String putProd(@RequestBody producto editProd) {
		return null;
	}
	
	@DeleteMapping("/prodcuto")
	public String delProd(@PathVariable producto delProd) {
		return null;
	}
}
