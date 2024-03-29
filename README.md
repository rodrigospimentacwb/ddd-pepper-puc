# Projeto de Domínio de Livraria Virtual

Este projeto foi desenvolvido por Rodrigo da Silva Pimenta para a disciplina de Arquitetura de BackEnd da PUC MG.

## Descrição

Este projeto tem como objetivo representar o domínio de um objeto de e-commerce de uma livraria virtual, utilizando conceitos de Domain-Driven Design (DDD). O código apresentado aqui é um esqueleto básico que demonstra a organização do domínio, não sendo executável por si só.

## Estrutura do Domínio

O domínio de um livro é representado por diversas entidades e value objects, organizados da seguinte forma:

- **Livro**: Raiz agregada que contém informações sobre o livro, como título, ISBN, descrição, autores, revisões, avaliações de clientes, informações do estoque e ofertas de vendedores.
- **Autor**: Entidade que representa o autor do livro, contendo nome e biografia.
- **Revisão**: Entidade que contém detalhes das revisões feitas no livro.
- **AvaliaçãoCliente**: Entidade que representa a avaliação de um cliente sobre o livro.
- **Vendedor**: Entidade que representa um vendedor que oferece o livro para venda.

Cada entidade é projetada de forma a não ser anêmica, ou seja, cada uma contém comportamentos relevantes para o seu contexto.

## Observações

Este projeto não é executável e serve apenas para demonstrar a organização do domínio de uma livraria virtual. O código apresentado aqui é um esqueleto básico e pode ser expandido com mais detalhes e funcionalidades de acordo com as necessidades do sistema.

