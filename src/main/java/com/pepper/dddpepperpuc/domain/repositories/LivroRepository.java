package com.pepper.dddpepperpuc.domain.repositories;

import com.pepper.dddpepperpuc.domain.entities.Livro;
import com.pepper.dddpepperpuc.domain.valueobjects.Autor;
import com.pepper.dddpepperpuc.domain.valueobjects.AvaliacaoCliente;
import com.pepper.dddpepperpuc.domain.valueobjects.Vendedor;

import java.util.List;

public interface LivroRepository {
    Livro buscarPorId(Long id);
    void salvar(Livro livro);
    void deletar(Livro livro);
    List<Livro> buscarTodos();
    List<Livro> buscarPorTitulo(String titulo);
    List<Livro> buscarPorAutor(Autor autor);
    List<Livro> buscarPorVendedor(Vendedor vendedor);
    List<Livro> buscarPorAvaliacao(AvaliacaoCliente avaliacao);
    List<Livro> buscarPorPalavraChave(String palavraChave);
}
