/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import projpoo.controller.dao.EstoqueDAO;
import projpoo.controller.dao.PedidoDAO;
import projpoo.model.Cliente;
import projpoo.model.Pedido;
import projpoo.model.Produto;
import projpoo.view.Manager;

/**
 *
 * @author clara
 */
public class PedidoController {

    Manager m = new Manager();
    Scanner in = new Scanner(System.in);
    PedidoDAO dao = new PedidoDAO();
    EstoqueDAO daoE = new EstoqueDAO();

    List<String> lista_produtos = new ArrayList<>();

    public void cadastro_pedido(Cliente cliente) {
        //cad. tipo de pag.
        m.askPagamento();
        String pag = in.next();
        in.nextLine();

        //data atual
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String hoje = dateFormat.format(date);

        //carrinho
        m.askNome();
        String nome = in.next();
        in.nextLine();
        while (!daoE.buscaNome(nome)) {
            m.naoEncontrado();
            m.askNome();
            nome = in.next();
            in.nextLine();
        }
        lista_produtos.add(nome);

        Pedido pedido = new Pedido(hoje);
        pedido.setCliente(cliente);
        pedido.setTipoPagamento(pag);
        pedido.setListaItens(lista_produtos);
    }

    public void remover_carrinho() {
        m.askNome();
        String nome = in.next();
        in.nextLine();
        for (int i = 0; i < lista_produtos.size(); i++) {
            if(lista_produtos.get(i).equalsIgnoreCase(nome)){
                lista_produtos.remove(nome);
            }
            else{
                m.naoEncontrado();
            }
        }
    }

}
