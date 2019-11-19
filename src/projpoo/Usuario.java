/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author clara
 */
public class Usuario extends Pessoa {
        
    private String login;
    private String senha;
    private String email;
    private List lista = new ArrayList();
    
    
    public Usuario(String nome, String end, String tel, String cpf, Date data) {
        super(nome, end, tel, cpf, data);
    }

    public Usuario(String login, String senha, String nome, String end, String tel, String cpf, Date data) {
        super(nome, end, tel, cpf, data);
        this.login = login;
        this.senha = senha;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
