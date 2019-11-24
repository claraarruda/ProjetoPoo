/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller;

import java.util.Scanner;
import projpoo.controller.dao.GerenteDAO;
import projpoo.model.Gerente;
import projpoo.view.Manager;

/**
 *
 * @author clara
 */
public class GerenteController {

    Manager m = new Manager();
    Scanner in = new Scanner(System.in);
    GerenteDAO dao = new GerenteDAO();

    public void cadastro_gerente() {

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
        m.askMatricula();
        int matricula = in.nextInt();

        //cad login
        m.askLogin();
        String login = in.next();
        in.nextLine();

        //cad. senha
        m.askSenha();
        String senha = in.next();
        in.nextLine();

        Gerente gerente = new Gerente();
        gerente.setNome(nome);
        gerente.setCpf(cpf);
        gerente.setEndereco(endereco);
        gerente.setTelefone(telefone);
        gerente.setMatricula(matricula);
        gerente.setLogin(login);
        gerente.setSenha(senha);

        dao.cadastro(gerente);
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
        int matricula = in.nextInt();
        dao.buscarMatricula(matricula);
    }

    public void remove_gerente() {
        m.askLogin();

    }

    public void atualiza_gerente() {

    }
}
