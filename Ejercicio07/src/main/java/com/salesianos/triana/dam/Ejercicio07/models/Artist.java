package com.salesianos.triana.dam.Ejercicio07.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Artist implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String nombre;

    @Builder.Default
    @OneToMany(mappedBy = "artist", fetch = FetchType.EAGER)
    private List<Song> listSongs = new ArrayList<>();


}
