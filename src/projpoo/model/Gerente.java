/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.model;

/**
 *
 * @author clara
 */
public class Gerente extends Usuario {
    
    private int matricula;

    public Gerente(){
        
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }    
    
    @Override
    public String toString() {
        return "Gerente{" + "matricula=" + matricula + '}';
    }
        
    
}
