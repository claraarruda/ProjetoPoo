/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller;

import java.util.Scanner;
import projpoo.controller.dao.Desejo;
import projpoo.controller.dao.ProdutoDAO;
import projpoo.model.Produto;
import projpoo.view.Manager;

/**
 *
 * @author clara
 */
public class ProdutoController {

    Manager m = new Manager();
    Scanner in = new Scanner(System.in);
    ProdutoDAO dao = new ProdutoDAO();
    
    Desejo lista = new Desejo();
    
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

        dao.cadastro(produto);
    }
    
    public String remove_estq() {
        m.askNome();
        String nome = in.next();
        in.nextLine();
        if(dao.remover(nome)){
        m.removido();
            return nome;
        }
        return "nao encontrado!";
    }

    public void lista_estq() {
        dao.listar();
    }

    public String busca_nome() {
        m.askNome();
        String nome = in.next();
        in.nextLine();
        if (dao.buscarNome(nome)) {
            return nome;
        }
        return "nao encontrado!";
    }

    public int busca_tam() {
        m.askTamanho();
        int tam = in.nextInt();
        if (dao.buscarTamanho(tam)) {
            return tam;
        }
        return '0';
    }

    public String atualiza_estoque() {
        m.askNome();
        String nome = in.next();
        in.nextLine();
        if (dao.atualizarEstoque(nome)) {
            return nome;
        }
        return "nao encontrado";
    }
    
    
    public void adcDesejo(){
        m.askNome();
        String nome = in.next();
        in.nextLine();
        Produto c = dao.buscaNome(nome);
        lista.cadastro(c);
    }
    
    public String removerDesejo(){
        m.askNome();
        String nome = in.next();
        in.nextLine();
        if(lista.remover(nome)){
            System.out.println("Removido com sucesso!");
            return nome;
        }
        return "nao encontrado!";
    }
    
    public void listarDesejo(){
        lista.listar();
    }

}
