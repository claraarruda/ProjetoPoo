package projpoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author clara
 */
public class Cliente extends Usuario {
    
    private List<Produto> lista;
    
    public Cliente(String nome, String end, String tel, String cpf, Date data, List<Produto> lista) {
        super(nome, end, tel, cpf, data);
        this.lista = new ArrayList<>();
    }    

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }
     
}
