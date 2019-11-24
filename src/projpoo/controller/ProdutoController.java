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

    Manager m = new Manager();
    Scanner in = new Scanner(System.in);
    EstoqueController eq = new EstoqueController(); 
    
    public void cadastro_produto() {
        String nome;
        double preco;
        String cor;
        int tamanho;

        //cad. nome
        m.askNome();
        nome = in.next();
        in.nextLine();

        //cad. tamanho
        m.askTamanho();
        tamanho = in.nextInt();

        //cad. preco
        m.askPreco();
        preco = in.nextDouble();

        //cad. cor
        m.askCor();
        cor = in.next();
        in.nextLine();

        Produto produto = new Produto(nome);
        produto.setTamanho(tamanho);
        produto.setPreco(preco);
        produto.setCor(cor);  

        eq.cadastro_estq(produto);        
    }
}
