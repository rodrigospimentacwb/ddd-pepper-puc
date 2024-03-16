package com.pepper.dddpepperpuc.domain.valueobjects;

import java.util.List;

public class AvaliacaoCliente {
    private Long id;
    private int classificacao;
    private String comentario;

    public AvaliacaoCliente(int classificacao, String comentario) {
        validarClassificacao(classificacao);
        validarComentario(comentario);

        this.classificacao = classificacao;
        this.comentario = comentario;
    }

    public Long getId() {
        return id;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public String getComentario() {
        return comentario;
    }

    private void validarClassificacao(int classificacao) {
        if (classificacao < 1 || classificacao > 5) {
            throw new IllegalArgumentException("A classificação deve estar entre 1 e 5.");
        }
    }

    private void validarComentario(String comentario) {
        if (comentario == null || comentario.trim().isEmpty()) {
            throw new IllegalArgumentException("O comentário não pode estar vazio.");
        }
    }

    public static void validarComentarios(List<AvaliacaoCliente> avaliacoes) {
        if (avaliacoes == null) {
            return;
        }

        boolean todosComentariosValidos = avaliacoes.stream().allMatch(avaliacao -> {
            try {
                avaliacao.validarComentario(avaliacao.getComentario());
                return true;
            } catch (IllegalArgumentException e) {
                return false;
            }
        });

        if (!todosComentariosValidos) {
            throw new IllegalArgumentException("Alguma avaliação possui comentário inválido.");
        }
    }
}
