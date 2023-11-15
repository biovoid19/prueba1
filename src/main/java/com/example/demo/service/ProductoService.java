package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Producto;
import com.example.demo.repository.ProductoRepository;


@Service
public class ProductoService {
	@Autowired
	ProductoRepository productoRepository;
	
	public Producto insertaProducto(Producto producto) {
		return productoRepository.save(producto);
	}
	
	public Producto consultaProducto(String nombre) {
		return productoRepository.findByNombre(nombre);
	}
	 
}
