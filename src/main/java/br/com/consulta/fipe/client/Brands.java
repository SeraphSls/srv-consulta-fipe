package br.com.consulta.fipe.client;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Brands {
    @JsonProperty("codigo")
    private String cod;
    @JsonProperty("nome")
    private String name;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
