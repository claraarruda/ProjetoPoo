/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import projpoo.model.Gerente;
import projpoo.view.Manager;

/**
 *
 * @author clara
 */
public class GerenteController {
    Gerente gerente;
    Manager m = new Manager();
    Scanner in = new Scanner(System.in);

    public void cadastro_gerente() {
        String nome;
        String telefone;
        String matricula;
        String cpf;
        String nasc;
        String login;
        String senha;
        String endereco;

        //cad. nome
        m.askNome();
        nome = in.next();
        in.nextLine();
        if (m.validarNome(nome)) {
            gerente.setNome(nome);
        } else {
            m.nomeInvalido();
        }

        //cad. cpf
        m.askCpf();
        cpf = in.next();
        in.nextLine();
        if (m.validaCpf(cpf)) {
            gerente.setCpf(cpf);
        } else {
            m.OpInvalida();
        }

        //cad. nasc
        m.askData();
        nasc = in.next();
        in.nextLine();
        DateFormat data = DateFormat.getInstance();
        try {
            Date da = data.parse(nasc);
            gerente.setNascimento(da);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        //cad. telefone
        m.askTelefone();
        telefone = in.next();
        in.nextLine();
        if(m.validarTelefone(telefone)){
            gerente.setTelefone(telefone);
        }
        else{
            m.telefoneInvalido();
        }
        
        //cad. matricula
        
        
        //cad. endereco
        m.askEndereco();
        endereco = in.next();
        in.nextLine();
        gerente.setEndereco(endereco);
               
       //cad login
        m.askLogin();
        login = in.next();
        in.nextLine();
        gerente.setLogin(login);
        
        //cad. senha
        m.askSenha();
        senha = in.next();
        in.nextLine();
        gerente.setSenha(senha);
                
    }
    
    public void remove_gerente(){
        m.askLogin();
        
    }
    
    public void atualiza_gerente(){
        
    }
}
