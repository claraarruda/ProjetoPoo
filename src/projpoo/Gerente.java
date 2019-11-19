/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo;

import java.util.Date;

/**
 *
 * @author clara
 */
public class Gerente extends Usuario {
    
    public Gerente(String login, String senha, String nome, String end, String tel, String cpf, Date data) {
        super(login, senha, nome, end, tel, cpf, data);
    }
    
}
