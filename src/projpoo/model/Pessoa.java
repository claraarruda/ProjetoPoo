package projpoo.model;

import java.util.Date;

/**
 *
 * @author clara
 */
public abstract class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private Date nascimento;
    
    public Pessoa(String nome, String end, String tel, String cpf, Date data) {
        this.nome = nome;
        this.endereco = end;
        this.telefone = tel;
        this.cpf = cpf;
        this.nascimento = data;
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    
    
}
