package com.web.service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.service.modelo.Album;
import com.web.service.repository.MongoAlbumRepository;

@Service
public class MongoAlbumController implements AlbumController{

	@Autowired
	MongoAlbumRepository repository;
	
	@Override
	public Optional<?> registrarAlbum(Album nuevoAlbum) {
		return Optional.of(repository.save(nuevoAlbum));
	}

	@Override
	public Optional<?> modificarAlbum(Album album) {
		
		if(repository.existsById(album.getId())) {
			return Optional.of(repository.save(album));
		}
		
		return Optional.empty();
	}

	@Override
	public Optional<?> borrarAlbum(String idAlbum) {
		if(repository.existsById(idAlbum)){
			repository.deleteById(idAlbum);
			return Optional.of("Objeto Eliminado");
		}
		return Optional.empty();
	}

	@Override
	public Optional<?> buscarAlbum(String idAlbum) {
		return repository.findById(idAlbum);
	}

	@Override
	public Optional<?> obtenerTodos() {
		return Optional.of(repository.findAll());
	}

}
