package com.pepper.dddpepperpuc.infrastructure.repositories;

import com.pepper.dddpepperpuc.domain.entities.Livro;
import com.pepper.dddpepperpuc.domain.repositories.LivroRepository;
import com.pepper.dddpepperpuc.domain.valueobjects.Autor;
import com.pepper.dddpepperpuc.domain.valueobjects.AvaliacaoCliente;
import com.pepper.dddpepperpuc.domain.valueobjects.Vendedor;

import java.util.List;

public class LivroRepositoryImpl implements LivroRepository {

    @Override
    public Livro buscarPorId(Long id) {
        return null;
    }

    @Override
    public void salvar(Livro livro) {

    }

    @Override
    public void deletar(Livro livro) {

    }

    @Override
    public List<Livro> buscarTodos() {
        return null;
    }

    @Override
    public List<Livro> buscarPorTitulo(String titulo) {
        return null;
    }

    @Override
    public List<Livro> buscarPorAutor(Autor autor) {
        return null;
    }

    @Override
    public List<Livro> buscarPorVendedor(Vendedor vendedor) {
        return null;
    }

    @Override
    public List<Livro> buscarPorAvaliacao(AvaliacaoCliente avaliacao) {
        return null;
    }

    @Override
    public List<Livro> buscarPorPalavraChave(String palavraChave) {
        return null;
    }
}
