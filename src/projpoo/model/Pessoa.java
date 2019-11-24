package projpoo.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author clara
 */
public abstract class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    
    public Pessoa(String nome, String end, String tel, String cpf) {
        this.nome = nome;
        this.endereco = end;
        this.telefone = tel;
        this.cpf = cpf;
    }  

    public Pessoa() {
    }
    
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }      

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    
}
