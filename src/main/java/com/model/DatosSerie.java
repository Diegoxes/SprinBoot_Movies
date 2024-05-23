package com.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) //ignora los campos que no hemos mapeado
public record DatosSerie(
        @JsonAlias ("Title") String titulo,
        @JsonAlias ("totalSeasons") Integer totaldeTemporadas,
        @JsonAlias ("imdbRating") String evaluacion)

    //json alias para leer
        // JsonProperty podemos leer y escribir , podemos enviar y leer

{


}
