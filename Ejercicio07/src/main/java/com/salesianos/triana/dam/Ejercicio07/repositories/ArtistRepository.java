package com.salesianos.triana.dam.Ejercicio07.repositories;

import com.salesianos.triana.dam.Ejercicio07.models.AddedTo;
import com.salesianos.triana.dam.Ejercicio07.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository
        extends JpaRepository<Artist, Long> {
}
