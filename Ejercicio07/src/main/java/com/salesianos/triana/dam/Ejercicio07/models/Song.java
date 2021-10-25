package com.salesianos.triana.dam.Ejercicio07.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Song implements Serializable {

    @Builder.Default
    @EmbeddedId
    private AddedTo id = new AddedTo();

    @Column(name = "tittle")
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "artist_id", foreignKey = @ForeignKey(name = "FK_SONG_ARTIST"))
    private Artist artist;

    private String album;

    private String year;

    @ManyToOne
    @MapsId("playlistId")
    @JoinColumn(name="playlistId")
    private Playlist playList;


    //HELPERS PARA ARTIST

    public void addArtist(Artist a) {
        this.artist = a;
        a.getListSongs().add(this);
    }

    public void removeArtist(Artist a) {
        a.getListSongs().remove(this);
        this.artist = null;
    }



    //HELPERS PARA PLAYLIST

    public void addToPlayList(Playlist p) {
        playList = p;
        p.getListSongs().add(this);
    }

    public void removeFromAsignatura(Playlist p) {
        p.getListSongs().remove(this);
        playList = null;
    }
}
