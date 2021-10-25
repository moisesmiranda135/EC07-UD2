package com.salesianos.triana.dam.Ejercicio07.services;

import com.salesianos.triana.dam.Ejercicio07.models.Song;
import com.salesianos.triana.dam.Ejercicio07.repositories.SongRepository;
import com.salesianos.triana.dam.Ejercicio07.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService
        extends BaseService<Song, Long, SongRepository> {
}
