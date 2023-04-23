package br.com.consulta.fipe.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjectsJson {
    @JsonProperty("codigo")
    private String codigo;
    @JsonProperty("nome")
    private String nome;
}
