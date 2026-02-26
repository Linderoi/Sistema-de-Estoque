package com.estoque.app;

import com.estoque.service.EstoqueService;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        EstoqueService service = new EstoqueService();
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Adicionar Estoque");
            System.out.println("4 - Valor Total do Estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    service.cadastrarProduto(id, nome, qtd, preco);
                    break;

                case 2:
                    service.listarProdutos();
                    break;

                case 3:
                    System.out.print("ID do produto: ");
                    int idProd = sc.nextInt();
                    System.out.print("Quantidade a adicionar: ");
                    int q = sc.nextInt();
                    service.adicionarEstoque(idProd, q);
                    break;

                case 4:
                    System.out.println("Valor total: R$ " + service.calcularValorTotal());
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}