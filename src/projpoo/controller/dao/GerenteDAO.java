/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller.dao;

import java.util.ArrayList;
import java.util.List;
import projpoo.model.Gerente;
import projpoo.view.Manager;

/**
 *
 * @author clara
 */
public class GerenteDAO {

    Manager m = new Manager();
    List<Gerente> gerentes = new ArrayList<>();

    public void cadastro(Gerente gerente) {
        gerentes.add(gerente);
    }

    public boolean remover(String cpf) {
        for (int i = 0; i < gerentes.size(); i++) {
            Gerente g = gerentes.get(i);
            if (g.getCpf().equals(cpf)) {
                System.out.println(g);
                gerentes.remove(g);
                return true;
            }
        }
        return false;
    }

    public void listarGerentes() {

        for (int i = 0; i < gerentes.size(); i++) {
            System.out.println("Nome: " + gerentes.get(i).getNome());
            System.out.println("Telefone: " + gerentes.get(i).getTelefone());
            System.out.println("Endereco: " + gerentes.get(i).getEndereco());
            System.out.println("Login: " + gerentes.get(i).getLogin());
            System.out.println("CPF: " + gerentes.get(i).getCpf());
            System.out.println("Matricula: " + gerentes.get(i).getMatricula());
        }
    }

    public boolean buscarCpf(String cpf) {
        for (int i = 0; i < gerentes.size(); i++) {
            if (gerentes.get(i).getCpf().equals(cpf)) {
                System.out.println("Nome: " + gerentes.get(i).getNome());
                System.out.println("Telefone: " + gerentes.get(i).getTelefone());
                System.out.println("Endereco: " + gerentes.get(i).getEndereco());
                System.out.println("Login: " + gerentes.get(i).getLogin());
                System.out.println("CPF: " + gerentes.get(i).getCpf());
                System.out.println("Matricula: " + gerentes.get(i).getMatricula());
                return true;
            }
        }
        return false;
    }

    public boolean buscaLogin(String login) {
        for (int i = 0; i < gerentes.size(); i++) {
            if (gerentes.get(i).getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }

    public boolean buscarMatricula(int matricula) {
        for (int i = 0; i < gerentes.size(); i++) {
            if (gerentes.get(i).getMatricula() == matricula) {
                System.out.println("Nome: " + gerentes.get(i).getNome());
                System.out.println("Telefone: " + gerentes.get(i).getTelefone());
                System.out.println("Endereco: " + gerentes.get(i).getEndereco());
                System.out.println("Login: " + gerentes.get(i).getLogin());
                System.out.println("CPF: " + gerentes.get(i).getCpf());
                System.out.println("Matricula: " + gerentes.get(i).getMatricula());
                return true;
            }
        }
        return false;
    }

    public boolean buscaLoginSenha(String l, String s) {
        for (int i = 0; i < gerentes.size(); i++) {
            if (gerentes.get(i).getLogin().equals(l)) {
                if (gerentes.get(i).getSenha().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

}
