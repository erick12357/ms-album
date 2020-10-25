package com.web.service.rest;


import org.springframework.http.ResponseEntity;
import com.web.service.modelo.Album;

public interface AlbumRest {

	public ResponseEntity<?> registrarAlbum(Album nuevoAlbum);
	public ResponseEntity<?> modificarAlbum(Album idAlbum);
	public ResponseEntity<?> borrarAlbum(String idAlbum);
	public ResponseEntity<?> buscarAlbum(String idAlbum);
	public ResponseEntity<?> obtenerTodos();
	
}
