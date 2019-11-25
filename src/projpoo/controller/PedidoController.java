/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller;

import java.util.Scanner;
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
    Pedido pedido = new Pedido();
    Produto produto = new Produto();
    Cliente cliente = new Cliente();
    
    public void cadastro_pedido() {

        pedido.setCliente(cliente);
        pedido.setProduto(produto);
        
        dao.cadastro(pedido);
    }

    public void remover() {
        m.askNome();
        String nome = in.next();
        in.nextLine();
        dao.remover(nome);
    }
    
    public void totalPedido(){
        dao.valorTotal();
    }
    
}
