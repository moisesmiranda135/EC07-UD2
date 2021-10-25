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

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "tittle")
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "artist_id", foreignKey = @ForeignKey(name = "FK_SONG_ARTIST"))
    private Artist artist;

    private String album;

    private String year;


    //HELPERS PARA ARTIST

    public void addArtist(Artist a) {
        this.artist = a;
        a.getListSongs().add(this);
    }

    public void removeArtist(Artist a) {
        a.getListSongs().remove(this);
        this.artist = null;
    }
}