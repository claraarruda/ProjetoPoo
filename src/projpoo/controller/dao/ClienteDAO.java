/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller.dao;

import java.util.ArrayList;
import java.util.List;
import projpoo.model.Cliente;
import projpoo.view.Manager;

/**
 *
 * @author clara
 */
public class ClienteDAO {

    Manager m = new Manager();
    List<Cliente> clientes = new ArrayList<>();

    public void cadastro(Cliente cliente) {
        clientes.add(cliente);
    }

    public void remover(String cpf) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if (c.getCpf().equals(cpf)) {
                System.out.println(c);
                clientes.remove(c);
            } else {
                m.naoEncontrado();
            }
        }
    }

    public void listarClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Nome: " + clientes.get(i).getNome());
            System.out.println("Telefone: " + clientes.get(i).getTelefone());
            System.out.println("Endereco: " + clientes.get(i).getEndereco());
            System.out.println("Email: " + clientes.get(i).getEmail());
            System.out.println("CPF: " + clientes.get(i).getCpf());

        }

    }

    public boolean buscaCpf(String cpf) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equals(cpf)) {
                System.out.println("Nome: " + clientes.get(i).getNome());
                System.out.println("Telefone: " + clientes.get(i).getTelefone());
                System.out.println("Endereco: " + clientes.get(i).getEndereco());
                System.out.println("Email: " + clientes.get(i).getEmail());
                System.out.println("CPF: " + clientes.get(i).getCpf());
                return true;
            }
        }
        return false;
    }

    public boolean buscaLogin(String login) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getLogin().equals(login)) {
                System.out.println("Nome: " + clientes.get(i).getNome());
                System.out.println("Telefone: " + clientes.get(i).getTelefone());
                System.out.println("Endereco: " + clientes.get(i).getEndereco());
                System.out.println("Email: " + clientes.get(i).getEmail());
                System.out.println("CPF: " + clientes.get(i).getCpf());
                return true;
            }
        }
        return false;
    }

    public boolean buscaLoginSenha(String l, String s) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getLogin().equals(l)) {
                if (clientes.get(i).getSenha().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

}
