package com.salesianos.triana.dam.Ejercicio07.repositories;

import com.salesianos.triana.dam.Ejercicio07.models.AddedTo;
import com.salesianos.triana.dam.Ejercicio07.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository
        extends JpaRepository<Song, Long> {
}
