package com.salesianos.triana.dam.Ejercicio07.repositories;

import com.salesianos.triana.dam.Ejercicio07.models.AddedTo;
import com.salesianos.triana.dam.Ejercicio07.models.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayListRepository
        extends JpaRepository<Playlist, Long> {
}
