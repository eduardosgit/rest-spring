package com.esilvrod.restapi.domain;

import lombok.*;

import java.io.Serializable;


@Data
public class Categoria implements Serializable {

    public Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    private Integer id;
    private String nome;

}
