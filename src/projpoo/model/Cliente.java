package projpoo.model;

import java.util.Objects;

/**
 *
 * @author clara
 */
public class Cliente extends Usuario {

    private String email;

    public Cliente(String email, String login, String senha, String nome, String end, String tel, String cpf) {
        super(login, senha, nome, end, tel, cpf);
        this.email = email;
    }

    public Cliente() {

    }  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "email=" + email + '}';
    }

    
}
