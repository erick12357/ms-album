package com.web.service.rest;


import org.springframework.http.ResponseEntity;
import com.web.service.modelo.Album;

public interface AlbumRest {

	public ResponseEntity<?> registrarAlbum(Album nuevoAlbum);
	public ResponseEntity<?> modificarAlbum(Integer idAlbum);
	public ResponseEntity<?> borrarAlbum(Integer idAlbum);
	public ResponseEntity<?> buscarAlbum(Integer idAlbum);
	public ResponseEntity<?> obtenerTodos();
	
}
