package com.web.service.modelo;

import java.time.LocalDate;

public class Album {

	private Integer idAlbum;
	private String nombre;
	private String artista;
	private LocalDate fechaDeSalida;
	private Integer idArtista;

	public Album() {
	}

	public Integer getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(Integer idAlbum) {
		this.idAlbum = idAlbum;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public LocalDate getFechaDeSalida() {
		return fechaDeSalida;
	}

	public void setFechaDeSalida(LocalDate fechaDeSalida) {
		this.fechaDeSalida = fechaDeSalida;
	}

	public Integer getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(Integer idArtista) {
		this.idArtista = idArtista;
	}

}
