package projpoo;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author clara
 */
public class Cliente extends Usuario {
    
    private String email;
       
    public Cliente(String nome, String end, String tel, String cpf, Date data, List<Produto> lista) {
        super(nome, end, tel, cpf, data);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "email=" + email + '}';
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

        
    
}
