/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller;

import java.util.Scanner;
import projpoo.controller.dao.ClienteDAO;
import projpoo.model.Cliente;
import projpoo.view.Manager;

//TODO: Fazer uma validacao de email, login e cpf (se ja existe no banco)
public class ClienteController {

    Manager m = new Manager();
    Scanner in = new Scanner(System.in);
    ClienteDAO dao = new ClienteDAO();

    public void cadastro_cliente() {

        //cad. nome
        m.askNome();
        String nome = in.next();
        in.nextLine();

        //cad. cpf
        m.askCpf();
        String cpf = in.next();
        in.nextLine();
        while (!m.validaCpf(cpf)) {
            m.OpInvalida();
            cpf = in.next();
            in.nextLine();
        }
        
        //cad. telefone
        m.askTelefone();
        String telefone = in.nextLine();
        while (!m.validarTelefone(telefone)) {
            m.telefoneInvalido();
            telefone = in.next();
            in.nextLine();
        }

        //cad. endereco
        m.askEndereco();
        String endereco = in.next();
        in.nextLine();

        //cad. email
        m.askEmail();
        String email = in.next();
        in.nextLine();

        //cad login
        m.askLogin();
        String login = in.next();
        in.nextLine();

        //cad. senha
        m.askSenha();
        String senha = in.next();
        in.nextLine();

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEndereco(endereco);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);
        cliente.setLogin(login);
        cliente.setSenha(senha);
        
        dao.cadastro(cliente);
    }

    public void remove_cliente() {
        m.askCpf();
        String cpf = in.next();
        in.nextLine();
        dao.remover(cpf);
        m.removido();
    }

    public void busca_cpf() {
        m.askCpf();
        String cpf = in.next();
        in.nextLine();
        dao.buscarCpf(cpf);
    }

    public void busca_login() {
        m.askLogin();
        String login = in.next();
        in.nextLine();
        dao.buscarLogin(login);
    }
}
