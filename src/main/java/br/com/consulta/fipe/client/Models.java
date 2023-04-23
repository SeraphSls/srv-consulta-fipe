package br.com.consulta.fipe.client;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Models {

    @JsonProperty("anos")
    private List<ObjectsJson> anos;

    @JsonProperty("modelos")
    private List<ObjectsJson> modelos;

}
