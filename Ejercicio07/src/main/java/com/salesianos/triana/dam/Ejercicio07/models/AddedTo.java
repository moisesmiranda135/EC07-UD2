package com.salesianos.triana.dam.Ejercicio07.models;

import lombok.*;

import javax.persistence.*;


@Embeddable
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class AddedTo {

    private Long song_id;

    private Long playlist_id;

    @Column(name = "datetime")
    private String fecha;

    @Column(name = "order")
    private String orden;
}
