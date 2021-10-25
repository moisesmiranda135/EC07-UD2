package com.salesianos.triana.dam.Ejercicio07.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Playlist {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String nombre;

    @Column(name = "description")
    @Lob
    private String descripcion;

    @Builder.Default
    @ManyToMany
    private List<Song> listSongs = new ArrayList<>();



    // HELPERS SONG

    public void addSong(Song s) {
        if (this.getListSongs() == null)
            this.setListSongs(new ArrayList<>());
        this.getListSongs().add(s);

        if (s.getPlaylist() == null)
            s.setPlaylist(new ArrayList<>());
        s.getPlaylist().add(this);
    }

    public void removeSong(Song s) {
        s.getPlaylist().remove(this);
        this.getListSongs().remove(s);
    }


}
