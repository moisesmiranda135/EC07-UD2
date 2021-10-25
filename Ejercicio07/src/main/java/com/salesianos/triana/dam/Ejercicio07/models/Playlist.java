package com.salesianos.triana.dam.Ejercicio07.models;

import lombok.*;

import javax.persistence.*;


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

}
