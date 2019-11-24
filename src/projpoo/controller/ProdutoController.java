/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller;

import java.util.Scanner;
import projpoo.model.Produto;
import projpoo.view.Manager;

/**
 *
 * @author clara
 */
public class ProdutoController {
    Produto produto;
    Manager m = new Manager();
    Scanner in = new Scanner(System.in);

    public void cadastro_produto() {
        String nome;
        double preco;
        String cor;
        int tamanho;
        
        //cad. nome
        m.askNome();
        nome = in.next();
        in.nextLine();
        if (m.validarNome(nome)) {
            produto.setNome(nome);
        } else {
            m.nomeInvalido();
        }
        
        //cad. tamanho
        m.askTamanho();
        tamanho = in.nextInt();
        produto.setTamanho(tamanho);

        //cad. preco
        m.askPreco();
        preco = in.nextDouble();
        produto.setPreco(preco);
        
        //cad. cor
        m.askCor();
        cor = in.next();
        in.nextLine();
        produto.setCor(cor);
        
    }
        
    public void remove_produto(){
        m.askNome();
        
    }
    
    public void atualiza_produto(){
        m.askNome();
    }
    
    public void busca_nome(){
        m.askNome();
    }
    
    public void busca_tamanho(){
        m.askTamanho();
    }
}
