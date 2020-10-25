package com.web.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.web.service.modelo.Album;

public interface MongoAlbumRepository extends MongoRepository<Album, String> {

}
