/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.model;

import java.util.Date;

/**
 *
 * @author clara
 */
public class Gerente extends Usuario {
    
    private int matricula;
    
    public Gerente(String login, String senha, String nome, String end, String tel, String cpf, Date data) {
        super(login, senha, nome, end, tel, cpf, data);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gerente other = (Gerente) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Gerente{" + "matricula=" + matricula + '}';
    }
        
    
}
