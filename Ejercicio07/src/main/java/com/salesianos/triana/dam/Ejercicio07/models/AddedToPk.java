package com.salesianos.triana.dam.Ejercicio07.models;


import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class AddedToPk implements Serializable {

    private Long song_id;
    private Long playlist_id;
}
