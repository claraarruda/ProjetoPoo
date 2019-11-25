/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.view;

import java.util.Scanner;
import projpoo.controller.ClienteController;
import projpoo.controller.GerenteController;
import projpoo.controller.ProdutoController;
/**
 *
 * @author clara
 */
public class Menus {

    Scanner in = new Scanner(System.in);
    char op;
    Manager m = new Manager();
    ProdutoController pc = new ProdutoController();
    ClienteController cc = new ClienteController();
    GerenteController gc = new GerenteController();

    public void menuPrincipal() {
        do {
            System.out.printf("\nEscolha uma das opções:\n0 - Sair\n1 - Login\n2 - Cadastro\n3 - Gerência:");
            op = in.next().charAt(0);
            switch (op) {
                case '1':
                    login();
                    break;
                case '2':
                    cc.cadastro_cliente();
                    break;
                case '3':
                    System.out.println("Autenticação necessária!");
                    System.out.println("Digite a senha padrão: ");
                    String senha = in.next();
                    in.nextLine();
                    while (!senha.equals("123")) {
                        m.senhaIncorreta();
                        senha = in.next();
                        in.nextLine();
                    }                    
                    menuGerente();
                    break;
                default:
                    break;
            }
        } while (op != '0');
    }

    public void login() {
        if (cc.loginSenha()) {
            cliente();
        }
        else{
            m.senhaIncorreta();
        }
    }

    public void cliente() {
        do {
            System.out.println("Escolha uma das opções:\n0 - sair\n1 - Ver todos produtos\n2 - Pesquisar por nome\n3 - Pesquisar por tamanho\n4 - Adicionar produtos a lista de desejos\n5 - Remover produtos da lista de desejos\n6 - Ver lista de desejos\n7 - Voltar:");
            op = in.next().charAt(0);
            switch (op) {
                case '1':
                    pc.lista_estq();
                    break;
                case '2':
                    pc.busca_nome();
                    break;
                case '3':
                    pc.busca_tam();
                    break;
                case '4':
                    pc.adcDesejo();
                    break;
                case '5':
                    pc.removerDesejo();
                    break;
                case '6':
                    pc.listarDesejo();
                    break;
                case '7':
                    menuPrincipal();
                    break;
                default:
                    break;
            }
        } while (op != '0');
    }

    public void menuGerente() {
        do {
            System.out.println("Digite uma das opções:\n0 - Sair\n1 - Cadastrar Gerente\n2 - Login Gerente\n3 - Voltar:");
            op = in.next().charAt(0);
            switch (op) {
                case '1':
                    gc.cadastro_gerente();
                    break;
                case '2':
                    loginGerente();
                    break;
                case '3':
                    menuPrincipal();
                    break;
                default:
                    break;
            }

        } while (op != '0');
    }

    public void loginGerente() {       
        if (gc.loginSenha()) {
            gerencia();
        }
        else{
            m.senhaIncorreta();
        }
    }

    public void gerencia() {
        do {
                System.out.println("Escolha uma das opções:\n0 - sair\n1 - Adicionar produto ao estoque\n2 - Excluir produto do estoque\n3 - Atualizar estoque\n4 - Consultar estoque\n5 - Voltar:");
            op = in.next().charAt(0);
            switch(op) {
                case '1':
                    pc.cadastro_produto();
                    break;
                case '2':
                    pc.remove_estq();
                    break;
                case '3':
                    pc.atualiza_estoque();
                    break;
                case '4':
                    pc.lista_estq();
                    break;
                case '5':
                    menuPrincipal();
                    break;
                default:
                    break;
            }
        } while (op != '0');
    }
}
