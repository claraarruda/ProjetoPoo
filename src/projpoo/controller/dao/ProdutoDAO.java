/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import projpoo.model.Produto;
import projpoo.view.Manager;

/**
 *
 * @author clara
 */
public class ProdutoDAO {
    Scanner in = new Scanner(System.in);
    Manager m = new Manager();
    List<Produto> produtos = new ArrayList<>();

    public void cadastro(Produto produto) {
        produtos.add(produto);
    }

    public boolean remover(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto c = produtos.get(i);
            if (c.getNome().equals(nome)) {
                System.out.println(c);
                produtos.remove(c);
                return true;
            }
        }
        return false;
    }

    public void listar() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("Nome: " + produtos.get(i).getNome());
            System.out.println("Quantidade: " + produtos.get(i).getQuantidade());
            System.out.println("Preço: " + produtos.get(i).getPreco());
            System.out.println("Cor: " + produtos.get(i).getCor());
            System.out.println("Tamanho: " + produtos.get(i).getTamanho());
        }

    }

    public boolean buscarNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                System.out.println("Nome: " + produtos.get(i).getNome());
                System.out.println("Quantidade: " + produtos.get(i).getQuantidade());
                System.out.println("Preço: " + produtos.get(i).getPreco());
                System.out.println("Cor: " + produtos.get(i).getCor());
                System.out.println("Tamanho: " + produtos.get(i).getTamanho());
                return true;
            }
        }
        return false;
    }
    
    
    public Produto buscaNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                return produtos.get(i);
            }
        }
        return produtos.get(0);
    }

    public boolean buscarTamanho(int tam) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getTamanho() == tam) {
                System.out.println("Nome: " + produtos.get(i).getNome());
                System.out.println("Quantidade: " + produtos.get(i).getQuantidade());
                System.out.println("Preço: " + produtos.get(i).getPreco());
                System.out.println("Cor: " + produtos.get(i).getCor());
                System.out.println("Tamanho: " + produtos.get(i).getTamanho());
                return true;
            }
        }
        return false;
    }

    public boolean atualizarEstoque(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                m.askQuantidade();
                int qtd = in.nextInt();
                produtos.get(i).setQuantidade(qtd);
                return true;
            }
        }
        return false;
    }
    
}
