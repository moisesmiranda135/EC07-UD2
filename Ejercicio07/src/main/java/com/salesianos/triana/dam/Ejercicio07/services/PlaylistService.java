package com.salesianos.triana.dam.Ejercicio07.services;

import com.salesianos.triana.dam.Ejercicio07.models.Playlist;
import com.salesianos.triana.dam.Ejercicio07.repositories.PlayListRepository;
import com.salesianos.triana.dam.Ejercicio07.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService
        extends BaseService<Playlist, Long, PlayListRepository> {
}
