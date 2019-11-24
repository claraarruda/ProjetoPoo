/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.controller;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import projpoo.model.Cliente;
import projpoo.model.Usuario;
import projpoo.model.Pessoa;
import projpoo.view.Manager;

//TODO: Fazer uma validacao de email, login e cpf (se ja existe no banco)

public class ClienteController {

    Cliente cliente;
    Manager m = new Manager();
    Scanner in = new Scanner(System.in);

    public void cadastro_cliente() {
        String nome;
        String telefone;
        String email;
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
            cliente.setNome(nome);
        } else {
            m.nomeInvalido();
        }

        //cad. cpf
        m.askCpf();
        cpf = in.next();
        in.nextLine();
        if (m.validaCpf(cpf)) {
            cliente.setCpf(cpf);
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
            cliente.setNascimento(da);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        //cad. telefone
        m.askTelefone();
        telefone = in.next();
        in.nextLine();
        if(m.validarTelefone(telefone)){
            cliente.setTelefone(telefone);
        }
        else{
            m.telefoneInvalido();
        }
        
        //cad. endereco
        m.askEndereco();
        endereco = in.next();
        in.nextLine();
        cliente.setEndereco(endereco);
        
        //cad. email
        m.askEmail();
        email = in.next();
        in.nextLine();
        cliente.setEmail(email);
        
       //cad login
        m.askLogin();
        login = in.next();
        in.nextLine();
        cliente.setLogin(login);
        
        //cad. senha
        m.askSenha();
        senha = in.next();
        in.nextLine();
        cliente.setSenha(senha);
                
    }
    
    public void remove_cliente(){
        m.askLogin();
        
    }
    
    public void atualiza_cliente(){
        m.askCpf();
    }
    
    public void busca_cpf(){
        m.askCpf();
    }
    
    public void busca_login(){
        m.askLogin();
    }
}
