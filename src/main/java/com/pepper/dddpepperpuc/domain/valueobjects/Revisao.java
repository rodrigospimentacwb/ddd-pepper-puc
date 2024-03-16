package com.pepper.dddpepperpuc.domain.valueobjects;

public class Revisao {
    private Long id;
    private String detalhesDaRevisao;

    public Revisao(String detalhesDaRevisao) {
        this.detalhesDaRevisao = detalhesDaRevisao;
    }

    public Long getId() {
        return id;
    }

    public String getDetalhesDaRevisao() {
        return detalhesDaRevisao;
    }
}
