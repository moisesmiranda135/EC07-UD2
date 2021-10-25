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
public class AddedTo implements Serializable {

    @Builder.Default
    @EmbeddedId
    private AddedToPk id = new AddedToPk();


    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name="playlist_id")
    private Playlist playlist;

    private String datetime;
    private String order;
}
