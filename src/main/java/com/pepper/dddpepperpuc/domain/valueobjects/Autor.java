package com.pepper.dddpepperpuc.domain.valueobjects;

import java.util.List;

public class Autor {
    private Long id;
    private String nome;
    private String biografia;

    public Autor(String nome, String biografia) {
        this.nome = nome;
        this.biografia = biografia;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getBiografia() {
        return biografia;
    }

    public void atualizarInformacoes(String novoNome, String novaBiografia) {
        this.nome = novoNome;
        this.biografia = novaBiografia;
    }

    private void validarBiografia() {
        if (biografia == null || biografia.trim().isEmpty()) {
            throw new IllegalArgumentException("A biografia não pode estar vazia.");
        }
    }

    public static void validarAutores(List<Autor> autores) {
        if (autores == null) {
            throw new IllegalArgumentException("A lista de autores não pode ser nula.");
        }

        boolean todasBiografiasValidas = autores.stream().allMatch(autor -> {
            try {
                autor.validarBiografia();
                return true;
            } catch (IllegalArgumentException e) {
                return false;
            }
        });

        if (!todasBiografiasValidas) {
            throw new IllegalArgumentException("Algum autor possui biografia inválida.");
        }
    }

    public boolean possuiBiografia() {
        return biografia != null && !biografia.isEmpty();
    }
}
