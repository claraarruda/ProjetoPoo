package projpoo;

import java.util.Date;

/**
 *
 * @author clara
 */
public class Cliente extends Pessoa {
    
    private String login;
    private String senha;
    
    public Cliente(String nome, String end, String tel, String cpf, Date data) {
        super(nome, end, tel, cpf, data);
    }
    
    
    
}
