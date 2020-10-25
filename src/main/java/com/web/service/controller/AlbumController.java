package com.web.service.controller;

import java.util.Optional;
import com.web.service.modelo.Album;

public interface AlbumController {

	public Optional<?> registrarAlbum(Album nuevoAlbum);
	public Optional<?> modificarAlbum(Album nuevoAlbum);
	public Optional<?> borrarAlbum(String idAlbum);
	public Optional<?> buscarAlbum(String idAlbum);
	public Optional<?> obtenerTodos();

}
