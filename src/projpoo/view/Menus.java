/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.view;

import java.util.Scanner;
import projpoo.controller.ClienteController;
import projpoo.controller.EstoqueController;
import projpoo.controller.GerenteController;
import projpoo.controller.PedidoController;
import projpoo.controller.ProdutoController;
import projpoo.controller.dao.ClienteDAO;
import projpoo.controller.dao.GerenteDAO;

/**
 *
 * @author clara
 */
public class Menus {

    Scanner in = new Scanner(System.in);
    char op;
    Manager m = new Manager();
    PedidoController pdc = new PedidoController();
    EstoqueController ec = new EstoqueController();
    ProdutoController pc = new ProdutoController();
    ClienteController cc = new ClienteController();
    GerenteController gc = new GerenteController();
    ClienteDAO cd = new ClienteDAO();
    GerenteDAO gd = new GerenteDAO();

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
                default:
                    break;
            }
        } while (op != '0');
    }

    public void login() {
        if (gc.loginSenha()) {
            cliente();
        }
        else{
            m.senhaIncorreta();
        }
    }

    public void cliente() {
        do {
            System.out.println("Escolha uma das opções:\n0 - sair\n1 - Ver todos produtos\n2 - Pesquisar por nome\n3 - Pesquisar por tamanho\n4 - Adicionar produtos a lista de desejos\n5 - Remover produtos da lista de desejos\n: ");
            switch (op) {
                case '1':
                    ec.lista_estq();
                    break;
                case '2':
                    ec.busca_nome();
                    break;
                case '3':
                    ec.busca_tam();
                    break;
                case '4':
                    pdc.cadastro_pedido();
                    pdc.totalPedido();
                    break;
                case '5':
                    pdc.remover();
                    break;
                default:
                    break;
            }
        } while (op != '0');
    }

    public void menuGerente() {
        do {
            System.out.println("Digite uma das opções:\n0 - Sair\n1 - Cadastrar Gerente\n2 - Login Gerente");
            op = in.next().charAt(0);
            switch (op) {
                case '1':
                    gc.cadastro_gerente();
                case '2':
                    loginGerente();
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
            System.out.println("Escolha uma das opções:\n0 - sair\n1 - Adicionar produto ao estoque\n2 - Excluir produto do estoque\n3 - Atualizar estoque\n4 - Consultar estoque");
            switch (op) {
                case '1':
                    pc.cadastro_produto();
                    break;
                case '2':
                    ec.remove_estq();
                    break;
                case '3':
                    ec.atualiza_estoque();
                    break;
                case '4':
                    ec.lista_estq();
                    break;
            }
        } while (op != '0');
    }
}
