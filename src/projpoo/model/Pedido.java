/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author clara
 */
public class Pedido {

    private Date data_venda;
    private List<Produto> carrinho = new ArrayList<>();
    private Cliente cliente;
    private String tipoPagamento;

    public List<Produto> getListaItens() {
        return carrinho;
    }

    public void setListaItens(List<Produto> lista_produtos) {
        this.carrinho = lista_produtos;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
