package com.pepper.dddpepperpuc.domain.valueobjects;

import java.util.List;

public class Vendedor {

    private Long id;
    private String nome;
    private String cnpj;
    private String endereco;

    public Vendedor(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean cnpjEstaValido() {
        // Lógica de validação do CNPJ
        return true;
    }

    public static void validarVendedores(List<Vendedor> vendedores) {
        if (vendedores == null) {
            return;
        }

        boolean todosVendedoresValidos = vendedores.stream().allMatch(vendedor -> {
            try {
                vendedor.cnpjEstaValido();
                return true;
            } catch (IllegalArgumentException e) {
                return false;
            }
        });

        if (!todosVendedoresValidos) {
            throw new IllegalArgumentException("Alguma vendedor esta com cnpj inválido.");
        }
    }
}