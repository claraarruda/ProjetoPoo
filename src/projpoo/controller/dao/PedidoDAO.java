/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller.dao;

import java.util.ArrayList;
import java.util.List;
import projpoo.controller.PedidoController;
import projpoo.model.Pedido;
import projpoo.view.Manager;

/**
 *
 * @author clara
 */
public class PedidoDAO {
    
    List<Pedido> pedidos = new ArrayList<>();
    Manager m = new Manager();
    PedidoController pc = new PedidoController();

    public void cadastro(Pedido pedido) {
        pedidos.add(pedido);
    }
    
    public void remover(String nome) {
        for (int i = 0; i < pedidos.size(); i++) {
            Pedido c = pedidos.get(i);
            if (c.getProduto().getNome().equals(nome)) {
                System.out.println(c);
                pedidos.remove(c);
            } else {
                m.naoEncontrado();
            }
        }
    }
    
    public void valorTotal(){
        double total = 0;
        for (int i = 0; i < pedidos.size(); i++) {
            double c = pedidos.get(i).getProduto().getPreco();
            total = total + c;
            System.out.println(total);
        }
    }
    
}
