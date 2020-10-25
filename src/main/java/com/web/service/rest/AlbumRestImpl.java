package com.web.service.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.service.controller.AlbumController;
import com.web.service.modelo.Album;

@RestController
public class AlbumRestImpl implements AlbumRest {

	AlbumController controller;

	public AlbumRestImpl() {
	}
	
	@Autowired
	public void setController(AlbumController controller) {
		this.controller = controller;
	}

	@PostMapping("/registrarAlbum")
	@Override
	public ResponseEntity<?> registrarAlbum(@RequestBody Album nuevoAlbum) {
		return ResponseEntity.ok(controller.registrarAlbum(nuevoAlbum));
	}

	@PutMapping("/modificarAlbum")
	@Override
	public ResponseEntity<?> modificarAlbum(@RequestBody Album idAlbum) {
		
		Optional<?> respuesta = controller.modificarAlbum(idAlbum);
		
		if(respuesta.isPresent()) {
			return ResponseEntity.ok(controller.modificarAlbum(idAlbum));
		}
		
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/borrarAlbum/{idAlbum}")
	@Override
	public ResponseEntity<?> borrarAlbum(@PathVariable String idAlbum) {
		
		Optional<?> respuesta = controller.borrarAlbum(idAlbum);
		if(respuesta.isPresent()) {
			return ResponseEntity.ok(respuesta.get());
		}
		
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/buscarAlbum/{idAlbum}")
	@Override
	public ResponseEntity<?> buscarAlbum(@PathVariable String idAlbum) {
		Optional<?> respuesta = controller.buscarAlbum(idAlbum);
		
		if(respuesta.isPresent()){
			return ResponseEntity.ok(respuesta.get());
		}
		return ResponseEntity.noContent().build();		
	}

	@Override
	@GetMapping("/obtenerTodos")
	public ResponseEntity<?> obtenerTodos() {
		return ResponseEntity.of(controller.obtenerTodos());
	}
}
