package com.salesianos.triana.dam.Ejercicio07.models;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EntityListeners(AuditingEntityListener.class)
public class AddedTo {
    @Builder.Default
    @EmbeddedId
    private AddedToPk id = new AddedToPk();


    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name = "song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;


    private LocalDateTime datetime;

    @OrderBy
    private int orden;

    public void addToSong(Song s) {
        song = s;
        s.getAddedTo().add(this);

    }

    public void removeFromSong(Song s) {
        s.getAddedTo().remove(this);
        song = null;
    }

    public void addToPlaylist(Playlist p) {
        playlist = p;
        p.getAddedTo().add(this);
    }

    public void removeFromPlaylist(Playlist p) {
        p.getAddedTo().remove(this);
        playlist = null;
    }

    public void addSongPlaylist(Playlist playlist, Song song) {
        addToPlaylist(playlist);
        addToSong(song);
    }

    public void removeSongPlaylist(Playlist playlist, Song song) {
        removeFromPlaylist(playlist);
        removeFromSong(song);
    }

}
