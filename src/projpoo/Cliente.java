package projpoo;

import java.util.Date;

/**
 *
 * @author clara
 */
public class Cliente extends Usuario {
    
    public Cliente(String login, String senha, String email, char tipo, String nome, String end, String tel, String cpf, Date data) {
        super(login, senha, email, tipo, nome, end, tel, cpf, data);
    }
    
}
