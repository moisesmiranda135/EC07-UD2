package com.salesianos.triana.dam.Ejercicio07;

import com.salesianos.triana.dam.Ejercicio07.models.AddedTo;
import com.salesianos.triana.dam.Ejercicio07.models.Artist;
import com.salesianos.triana.dam.Ejercicio07.models.Playlist;
import com.salesianos.triana.dam.Ejercicio07.models.Song;
import com.salesianos.triana.dam.Ejercicio07.services.AddedToService;
import com.salesianos.triana.dam.Ejercicio07.services.ArtistService;
import com.salesianos.triana.dam.Ejercicio07.services.PlaylistService;
import com.salesianos.triana.dam.Ejercicio07.services.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;


@Component
@RequiredArgsConstructor
public class MainPrueba {

    private final SongService songService;
    private final PlaylistService playlistService;
    private final ArtistService artistService;
    private final AddedToService addedToService;

    @PostConstruct
    public void test() {

        Artist artist = Artist.builder()
                .nombre("Morat")
                .build();

        artistService.edit(artist);


        Song song = Song.builder()
                .titulo("Besos en Guerra")
                .artist(artist)
                .build();

        songService.save(song);
        song.addArtist(artist);


        Playlist playlist = Playlist.builder()
                .nombre("Para despejarme un poco después de programar")
                .build();

        playlistService.save(playlist);


        AddedTo addedTo = AddedTo.builder()
                        .song(song)
                        .playlist(playlist)
                        .datetime(LocalDateTime.now())
                        .build();

        addedToService.edit(addedTo);



        System.out.println("El título de la Playlist creada se tiene de nombre: " + addedTo.getPlaylist().getNombre() +
                ", tiene añadida la canción " + addedTo.getSong().getTitulo() +
                " y el artista de la canción se llama " + addedTo.getSong().getArtist().getNombre());

        System.out.println(addedTo.getDatetime());

    }



}
