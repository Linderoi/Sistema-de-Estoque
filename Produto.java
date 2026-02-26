package com.estoque.model;

public class Produto {

    private int id;
    private String nome;
    private  int quantidade;
    private double preco;

    public Produto(int id, String nome, int qtd, double preco) {
    }

    public void Produto(int id, String nome, int quantidade, double preco){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void adcionarQuantidade(int valor){
        this.quantidade += valor;
    }

    public double getValorTotal(){
        return quantidade * preco;
    }
}
