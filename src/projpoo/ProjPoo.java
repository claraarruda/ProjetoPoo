package projpoo;

import java.util.Scanner;
import projpoo.controller.ClienteController;

/**
 *
 * @author Clara
 */
public class ProjPoo {


    public static void main(String[] args) {

        ClienteController cd = new ClienteController();
                
        char op_bemvindo;  
        do{
            System.out.printf("Bem Vindo!\n\nEscolha uma das opções:\n0 - Sair\n1 - Login\n2 - Cadastro\n:");
            Scanner in = new Scanner(System.in);
            op_bemvindo = in.next().charAt(0);

            switch(op_bemvindo){
                case '1':
                    System.out.println("Domingo");
                    break;
                case '2':
                    System.out.println("cadastro");
                    cd.cadastro_cliente();
                    break;
                case '3':
                    cd.busca_login();
                    break;
                case '4':
                    cd.busca_cpf();
                    break;
                case '5':
                    cd.remove_cliente();
                    break;
                default:
                    break;
            }
        }while(op_bemvindo != '0');
    }
    
}
