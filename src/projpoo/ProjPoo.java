package projpoo;

import java.util.Scanner;

/**
 *
 * @author Clara
 */
public class ProjPoo {


    public static void main(String[] args) {
        
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
                    break;
                default:
                    break;
            }
        }while(op_bemvindo == 0);
    }
    
}
