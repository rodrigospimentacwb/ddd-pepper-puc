package com.pepper.dddpepperpuc.domain.entities;

import com.pepper.dddpepperpuc.domain.valueobjects.Autor;
import com.pepper.dddpepperpuc.domain.valueobjects.AvaliacaoCliente;
import com.pepper.dddpepperpuc.domain.valueobjects.Revisao;
import com.pepper.dddpepperpuc.domain.valueobjects.Vendedor;

import java.util.List;

public class Livro {
    private Long id;
    private String titulo;
    private String isbn;
    private String descricao;
    private List<Autor> autores;
    private List<Revisao> revisoes;
    private List<AvaliacaoCliente> avaliacoes;
    private List<Livro> livrosRelacionados;
    private int quantidadeEmEstoque;
    private List<Vendedor> vendedoresDisponiveis;

    public Livro(String titulo, String isbn, String descricao, List<Autor> autores, List<Revisao> revisoes, List<AvaliacaoCliente> avaliacoes, List<Livro> livrosRelacionados, int quantidadeEmEstoque, List<Vendedor> vendedoresDisponiveis) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.descricao = descricao;
        this.autores = autores;
        this.revisoes = revisoes;
        this.avaliacoes = avaliacoes;
        this.livrosRelacionados = livrosRelacionados;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.vendedoresDisponiveis = vendedoresDisponiveis;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Revisao> getRevisoes() {
        return revisoes;
    }

    public List<AvaliacaoCliente> getAvaliacoes() {
        return avaliacoes;
    }

    public List<Livro> getLivrosRelacionados() {
        return livrosRelacionados;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public List<Vendedor> getVendedoresDisponiveis() {
        return vendedoresDisponiveis;
    }

    public boolean estaDisponivelParaCompra() {
        return quantidadeEmEstoque > 0;
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade a ser removida excede o estoque disponível.");
        }
    }
}
