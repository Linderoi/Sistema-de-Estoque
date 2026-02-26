package com.estoque.service;

import com.estoque.model.Produto;
import com.estoque.repository.ProdutoRepository;


public class EstoqueService {

    private final ProdutoRepository repository = new ProdutoRepository();

    public void cadastrarProduto(int id, String nome, int qtd, double preco){
        Produto produto = new Produto(id, nome, qtd, preco);
        repository.salvar(produto);

    }

    public void adcionarEstoque(int id, int qtd){
        Produto produto = repository.buscarPorId(id);
        if (produto != null){
            produto.adcionarQuantidade(qtd);
        }else {
            System.out.println("Produto não encontrado.");
        }
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Produto p : repository.listar()){
            total += p.getValorTotal();
        }
        return total;
    }

    public void listarProdutos() {
    }

    public void adicionarEstoque(int idProd, int q) {
    }
}
