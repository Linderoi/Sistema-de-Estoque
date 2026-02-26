package com.estoque.repository;

import com.estoque.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private List<Produto> produtos = new ArrayList<>();

    public void salvar(Produto produto){
        produtos.add(produto);
    }
    public List<Produto> listar(){
        return produtos;
    }
    public Produto buscarPorId(int id){
        for (Produto p : produtos){
            if (p.getId() == id){
                return p;
            }
        }
        return null;

    }

    public void remover(int id){
        produtos.removeIf(p -> p.getId() == id);
    }
}
