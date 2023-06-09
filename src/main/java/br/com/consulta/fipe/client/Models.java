package br.com.consulta.fipe.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Models {

    @JsonProperty("codigo")
    private Integer codigo;
    @JsonProperty("nome")
    private String nome;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
