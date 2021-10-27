package com.salesianos.triana.dam.Ejercicio07;

import com.salesianos.triana.dam.Ejercicio07.models.Artist;
import com.salesianos.triana.dam.Ejercicio07.models.Playlist;
import com.salesianos.triana.dam.Ejercicio07.models.Song;
import com.salesianos.triana.dam.Ejercicio07.services.ArtistService;
import com.salesianos.triana.dam.Ejercicio07.services.PlaylistService;
import com.salesianos.triana.dam.Ejercicio07.services.SongService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@AllArgsConstructor
public class MainDePrueba {

    private final ArtistService artistService;
    private final PlaylistService playlistService;
    private final SongService songService;

    @PostConstruct
    public void test() {

        Artist a = Artist.builder()
                .nombre("jesus")
                .build();

        artistService.edit(a);

        Song s = Song.builder()
                .titulo("vaya tela")
                .build();

        songService.edit(s);

        Playlist p = Playlist.builder()
                .nombre("playlist caca")
                .build();
        playlistService.edit(p);

        s.addArtist(a);
        s.addToPlayList(p);


        System.out.println("La cancion se llama " + s.getTitulo() + ", el artista de la canción es " + s.getArtist().getNombre()
                + "y esta añadida a la playlist: " + s.getPlayList().getNombre() );





    }









    }
