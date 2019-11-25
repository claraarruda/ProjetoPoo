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

/**
 *
 * @author clara
 */
public class Desejo {

    List<Produto> carrinho = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    double total = 0;
    int qtd = 0;

    public void listar() {
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println("Nome: " + carrinho.get(i).getNome());
            System.out.println("Preço: " + carrinho.get(i).getPreco());
        }
    }

    public void cadastro(Produto produto) {
        carrinho.add(produto);
        qtd++;
        produto.setQuantidade(produto.getQuantidade() - 1);
        total = total + (produto.getPreco() * qtd);
        System.out.println("Total parcial da lista de desejos: " + total);
    }

    public boolean remover(String nome) {
        for (int i = 0; i < carrinho.size(); i++) {
            if (carrinho.get(i).getNome().equals(nome)) {
                carrinho.remove(carrinho.get(i));
                qtd--;
                return true;
            }
        }
        return false;
    }

}
