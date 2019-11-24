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
    private final List<Cliente> clientes = new ArrayList<>();

    public void cadastro(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void remover(Cliente cliente){
        clientes.remove(cliente);
    }
    
    public void listarClientes(){
        if(clientes.isEmpty()){
            m.listaVazia();
        }
        else{
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println("Nome: " + clientes.get(i).getNome());
                System.out.println("Telefone: " + clientes.get(i).getTelefone());
                System.out.println("Endereco: " + clientes.get(i).getEndereco());
                System.out.println("Email: " + clientes.get(i).getEmail());
                System.out.println("Login: " + clientes.get(i).getLogin());
                System.out.println("CPF: " + clientes.get(i).getCpf());
                
            }
        }
    }
    
    public void buscarCpf(String cpf){
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getCpf().equals(cpf)){
                clientes.get(i);
            }
            else{
                m.naoEncontrado();
            }
        }
    }
    
    public void buscarLogin(String login){
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getLogin().equals(login)){
                clientes.get(i);
            }
            else{
                m.naoEncontrado();
            }
        }
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }

}
