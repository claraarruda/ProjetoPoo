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

    public void remover(String cpf) {
        for (int i = 0; i < gerentes.size(); i++) {
            Gerente g = gerentes.get(i);
            if (g.getCpf().equals(cpf)) {
                System.out.println(g);
                gerentes.remove(g);
            } else {
                m.naoEncontrado();
            }
        }
    }

    public void listarGerentes() {
        if (gerentes.isEmpty()) {
            m.listaVazia();
        } else {
            for (int i = 0; i < gerentes.size(); i++) {
                System.out.println("Nome: " + gerentes.get(i).getNome());
                System.out.println("Telefone: " + gerentes.get(i).getTelefone());
                System.out.println("Endereco: " + gerentes.get(i).getEndereco());
                System.out.println("Login: " + gerentes.get(i).getLogin());
                System.out.println("CPF: " + gerentes.get(i).getCpf());
                System.out.println("Matricula: " + gerentes.get(i).getMatricula());

            }
        }
    }

    public void buscarCpf(String cpf) {
        for (int i = 0; i < gerentes.size(); i++) {
            if (gerentes.get(i).getCpf().equals(cpf)) {
                System.out.println("Nome: " + gerentes.get(i).getNome());
                System.out.println("Telefone: " + gerentes.get(i).getTelefone());
                System.out.println("Endereco: " + gerentes.get(i).getEndereco());
                System.out.println("Login: " + gerentes.get(i).getLogin());
                System.out.println("CPF: " + gerentes.get(i).getCpf());
                System.out.println("Matricula: " + gerentes.get(i).getMatricula());

            } else {
                m.naoEncontrado();
            }
        }
    }

    public void buscarMatricula(int matricula) {
        for (int i = 0; i < gerentes.size(); i++) {
            if (gerentes.get(i).getMatricula() == matricula) {
                System.out.println("Nome: " + gerentes.get(i).getNome());
                System.out.println("Telefone: " + gerentes.get(i).getTelefone());
                System.out.println("Endereco: " + gerentes.get(i).getEndereco());
                System.out.println("Login: " + gerentes.get(i).getLogin());
                System.out.println("CPF: " + gerentes.get(i).getCpf());
                System.out.println("Matricula: " + gerentes.get(i).getMatricula());
            } else {
                m.naoEncontrado();
            }
        }
    }

}
