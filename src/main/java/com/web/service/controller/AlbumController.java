package com.web.service.controller;

import java.util.Optional;
import com.web.service.modelo.Album;

public interface AlbumController {

	public Optional<?> registrarAlbum(Album nuevoAlbum);
	public Optional<?> modificarAlbum(Integer idAlbum);
	public Optional<?> borrarAlbum(Integer idAlbum);
	public Optional<?> buscarAlbum(Integer idAlbum);
	public Optional<?> obtenerTodos();

}
