/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller;

import java.util.Scanner;
import projpoo.controller.dao.EstoqueDAO;
import projpoo.model.Estoque;
import projpoo.model.Produto;
import projpoo.view.Manager;

/**
 *
 * @author clara
 */
public class EstoqueController {

    Scanner in = new Scanner(System.in);
    Estoque estoque = new Estoque();
    EstoqueDAO dao = new EstoqueDAO();
    Manager m = new Manager();

    public void cadastro_estq(Produto produto) {

        m.askQuantidade();
        int qtd = in.nextInt();

        estoque.setProduto(produto);
        estoque.setQuantidade(qtd);

        dao.cadastro(estoque);
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
}
