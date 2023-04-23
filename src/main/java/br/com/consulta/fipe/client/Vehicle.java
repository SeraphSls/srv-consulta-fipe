package br.com.consulta.fipe.client;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Vehicle {

    @JsonProperty("modelos")
    private List<Models> models;
    @JsonProperty("anos")
    private List<Years> anos;

}