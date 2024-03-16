package com.pepper.dddpepperpuc.application.service;

import com.pepper.dddpepperpuc.domain.entities.Livro;
import com.pepper.dddpepperpuc.domain.repositories.LivroRepository;
import com.pepper.dddpepperpuc.domain.valueobjects.Autor;
import com.pepper.dddpepperpuc.domain.valueobjects.AvaliacaoCliente;
import com.pepper.dddpepperpuc.domain.valueobjects.Revisao;
import com.pepper.dddpepperpuc.domain.valueobjects.Vendedor;
import jakarta.annotation.Resource;

import java.util.List;

public class LivroService {

    @Resource
    LivroRepository repository;

    public void cadastrar(String titulo, String isbn, String descricao,
                               List<Autor> autores, List<Revisao> revisoes,
                               List<AvaliacaoCliente> avaliacoes, List<Livro> livrosRelacionados,
                               int quantidadeEmEstoque, List<Vendedor> vendedoresDisponiveis) {

        Livro livro = new Livro(titulo, isbn, descricao, autores, revisoes, avaliacoes,
                livrosRelacionados, quantidadeEmEstoque, vendedoresDisponiveis);

        Autor.validarAutores(livro.getAutores());
        AvaliacaoCliente.validarComentarios(livro.getAvaliacoes());
        Vendedor.validarVendedores(livro.getVendedoresDisponiveis());

        repository.salvar(livro);
    }

    public Integer retornarQuantidadeEmEstoque(Long id) {
        return buscar(id).getQuantidadeEmEstoque();
    }

    public boolean validarPossibilidadeVenda(Long id) {
        return buscar(id).estaDisponivelParaCompra();
    }

    public boolean adicionarNovosExemplares(Long id, Integer quantidade) {
        Livro livro = buscar(id);
        livro.adicionarEstoque(quantidade);
        repository.salvar(livro);
        return true;
    }

    public Livro buscar(Long id) {
        Livro livro = repository.buscarPorId(id);
        if (livro == null) {
            throw new RuntimeException("Livro não encontrado");
        }
        return livro;
    }

    public List<Livro> listarTodos() {
        return repository.buscarTodos();
    }

    public List<Livro> buscarPorTitulo(String titulo) {
        return repository.buscarPorTitulo(titulo);
    }

    public List<Livro> buscarPorAutor(Autor autor) {
        return repository.buscarPorAutor(autor);
    }

    public List<Livro> buscarPorVendedor(Vendedor vendedor) {
        return repository.buscarPorVendedor(vendedor);
    }

    public List<Livro> buscarPorAvaliacao(AvaliacaoCliente avaliacao) {
        return repository.buscarPorAvaliacao(avaliacao);
    }

    public List<Livro> buscarPorPalavraChave(String palavraChave) {
        return repository.buscarPorPalavraChave(palavraChave);
    }
}
