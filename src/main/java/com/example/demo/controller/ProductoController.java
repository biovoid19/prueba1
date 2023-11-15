package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Producto;
import com.example.demo.service.ProductoService;

@RestController
@RequestMapping("api/tienda")
public class ProductoController {
	@Autowired
	ProductoService productoService;
	
	@PostMapping("alta")
	public ResponseEntity<Producto> altaProducto(@RequestBody Producto producto){
		return new ResponseEntity<>(productoService.insertaProducto(producto),HttpStatus.OK);
	}
	
	@GetMapping("consult-nombrea/{nombre}")
	public ResponseEntity<Producto> consulta(@PathVariable String nombre){
		return new ResponseEntity<>(productoService.consultaProducto(nombre),HttpStatus.OK);
		
	}
}
