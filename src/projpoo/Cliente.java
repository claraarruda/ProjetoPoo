package projpoo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author clara
 */
public class Cliente extends Usuario {
    
    private int id;
       
    public Cliente(String nome, String end, String tel, String cpf, Date data, List<Produto> lista) {
        super(nome, end, tel, cpf, data);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + '}';
    }    
    
}
