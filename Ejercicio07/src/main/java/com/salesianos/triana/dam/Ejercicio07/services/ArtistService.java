package com.salesianos.triana.dam.Ejercicio07.services;

import com.salesianos.triana.dam.Ejercicio07.models.Artist;
import com.salesianos.triana.dam.Ejercicio07.repositories.ArtistRepository;
import com.salesianos.triana.dam.Ejercicio07.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService
        extends BaseService<Artist, Long, ArtistRepository> {
}
