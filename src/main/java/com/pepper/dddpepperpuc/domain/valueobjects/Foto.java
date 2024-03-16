package com.pepper.dddpepperpuc.domain.valueobjects;

public class Foto {
    private Long id;
    private String nome;
    private String enderecoNaInternetDaFoto;
    private byte[] foto;

    public Foto(String nome, String enderecoNaInternet, byte[] foto) {
        this.nome = nome;
        this.enderecoNaInternetDaFoto = enderecoNaInternetDaFoto;
        this.foto = foto;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEnderecoNaInternetDaFoto() {
        return enderecoNaInternetDaFoto;
    }

    public byte[] getFoto() {
        return foto;
    }

    public byte[] redimensionarFoto(int largura, int altura) {
        // Aplica logica para redimencionar a foto
        return foto;
    }
}