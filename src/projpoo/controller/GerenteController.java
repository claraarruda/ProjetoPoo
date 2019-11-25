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
        Gerente gerente = new Gerente();
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
        if (dao.buscarCpf(cpf)) {
            System.out.println("cpf já existe. Digite novamente: ");
            cpf = in.next();
            in.nextLine();
        } else {
            gerente.setCpf(cpf);
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
        if (!dao.buscarMatricula(matricula)) {
            gerente.setMatricula(matricula);
        } else {
            System.out.println("matricula já existe. Digite novamente: ");
            matricula = in.nextInt();
        }

        //cad login
        m.askLogin();
        String login = in.next();
        in.nextLine();
        if (dao.buscaLogin(login)) {
            System.out.println("login já existe. Digite novamente: ");
            login = in.next();
            in.nextLine();
        } else {
            gerente.setLogin(login);
        }

        //cad. senha
        m.askSenha();
        String senha = in.next();
        in.nextLine();

        gerente.setNome(nome);
        gerente.setEndereco(endereco);
        gerente.setTelefone(telefone);
        gerente.setSenha(senha);

        dao.cadastro(gerente);
    }

    public String remove_gerente() {
        m.askCpf();
        String cpf = in.next();
        in.nextLine();
        if (dao.remover(cpf)) {
            m.removido();
            return cpf;
        }
        return "nao encontrado!";

    }

    public String busca_cpf() {
        m.askCpf();
        String cpf = in.next();
        in.nextLine();
        if (dao.buscarCpf(cpf)) {
            return cpf;
        }
        return "nao encontrado!";
    }

    public int busca_matricula() {
        m.askMatricula();
        int matricula = in.nextInt();
        if (dao.buscarMatricula(matricula)) {
            return matricula;
        }
        return '0';
    }

    public boolean loginSenha() {
        m.askLogin();
        String l = in.next();
        in.nextLine();
        m.askSenha();
        String s = in.next();
        in.nextLine();
        if (dao.buscaLoginSenha(l, s)) {
            return true;
        }
        return false;
    }
}
