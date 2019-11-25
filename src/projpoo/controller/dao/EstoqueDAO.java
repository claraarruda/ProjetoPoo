/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import projpoo.model.Estoque;
import projpoo.view.Manager;

/**
 *
 * @author clara
 */
public class EstoqueDAO {

    Scanner in = new Scanner(System.in);
    Manager m = new Manager();
    List<Estoque> estoques = new ArrayList<>();

    public void cadastro(Estoque estoque) {
        estoques.add(estoque);
    }

    public boolean remover(String nome) {
        for (int i = 0; i < estoques.size(); i++) {
            Estoque c = estoques.get(i);
            if (c.getProduto().getNome().equals(nome)) {
                System.out.println(c);
                estoques.remove(c);
                return true;
            } 
        }
        return false;
    }

    public void listar() {
        if (estoques.isEmpty()) {
            m.listaVazia();
        } else {
            for (int i = 0; i < estoques.size(); i++) {
                System.out.println("Nome: " + estoques.get(i).getProduto().getNome());
                System.out.println("Quantidade: " + estoques.get(i).getQuantidade());
                System.out.println("Preço: " + estoques.get(i).getProduto().getPreco());
                System.out.println("Cor: " + estoques.get(i).getProduto().getCor());
                System.out.println("Tamanho: " + estoques.get(i).getProduto().getTamanho());
            }
        }
    }

    public boolean buscarNome(String nome) {
        for (int i = 0; i < estoques.size(); i++) {
            if (estoques.get(i).getProduto().getNome().equals(nome)) {
                System.out.println("Nome: " + estoques.get(i).getProduto().getNome());
                System.out.println("Quantidade: " + estoques.get(i).getQuantidade());
                System.out.println("Preço: " + estoques.get(i).getProduto().getPreco());
                System.out.println("Cor: " + estoques.get(i).getProduto().getCor());
                System.out.println("Tamanho: " + estoques.get(i).getProduto().getTamanho());
                return true;
            } 
        }
        return false;
    }
    
    public boolean buscarTamanho(int tam) {
        for (int i = 0; i < estoques.size(); i++) {
            if (estoques.get(i).getProduto().getTamanho() == tam) {
                System.out.println("Nome: " + estoques.get(i).getProduto().getNome());
                System.out.println("Quantidade: " + estoques.get(i).getQuantidade());
                System.out.println("Preço: " + estoques.get(i).getProduto().getPreco());
                System.out.println("Cor: " + estoques.get(i).getProduto().getCor());
                System.out.println("Tamanho: " + estoques.get(i).getProduto().getTamanho());
                return true;
            } 
        }
        return false;
    }
  
    public boolean atualizarEstoque(String nome){
        for (int i = 0; i < estoques.size(); i++) {
            if (estoques.get(i).getProduto().getNome().equals(nome)) {
                m.askQuantidade();
                int qtd = in.nextInt();
                estoques.get(i).setQuantidade(qtd);                
                return true;
            }
        }
        return false;
    }

}
