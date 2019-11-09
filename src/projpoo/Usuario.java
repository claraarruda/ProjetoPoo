package projpoo;


import java.util.Date;

/**
 *
 * @author clara
 */
public class Usuario extends Pessoa {
    
    private String login;
    private String senha;
    private String email;
    private final char tipo;
    
       
    public Usuario(String nome, String end, String tel, String cpf, Date data, char tipo) {
        super(nome, end, tel, cpf, data);
        this.tipo = tipo;
    }

    public Usuario(String login, String senha, String email, char tipo, String nome, String end, String tel, String cpf, Date data) {
        super(nome, end, tel, cpf, data);
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.tipo = tipo;
    }   
    

    public char getTipo() {
        return tipo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
