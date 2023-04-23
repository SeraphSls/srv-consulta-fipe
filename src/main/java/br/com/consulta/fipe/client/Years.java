package br.com.consulta.fipe.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Years {

    @JsonProperty("codigo")
    private String codigo;
    @JsonProperty("nome")
    private String nome;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
