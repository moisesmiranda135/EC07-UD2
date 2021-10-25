package com.salesianos.triana.dam.Ejercicio07.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Embeddable
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class AddedTo implements Serializable {

    private Long songId;

    private Long playlistId;

    @Column(name = "datetime")
    private String fecha;

    @Column(name = "order")
    private String orden;
}
