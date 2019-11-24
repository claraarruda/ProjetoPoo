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
import projpoo.controller.ProdutoController;
import projpoo.controller.dao.ClienteDAO;
import projpoo.controller.dao.EstoqueDAO;
import projpoo.controller.dao.GerenteDAO;

/**
 *
 * @author clara
 */
public class Menus {

    Scanner in = new Scanner(System.in);
    char op;
    Manager m = new Manager();
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
                    System.out.println("Domingo");
                    break;
                case '2':
                    menuCadastro();
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
            }
        } while (op != '0');
    }

    public void menuCadastro() {
        do {
            System.out.println("Escolha uma das opções:\n0 - Sair\n1 - Cadastro de cliente\n2 - Cadastro de Gerentes (necessária autenticação)\n: ");
            switch (op) {
                case '1':
                    cc.cadastro_cliente();
                    break;
                case '2':

            }
        } while (op != '0');
    }

    public void login() {
        System.out.printf("Se desejar sair, digite SAIR.\n");
        m.askLogin();
        String login = in.next();
        in.nextLine();
        String sair = "sair";
        if (login.equalsIgnoreCase(sair)) {
            menuPrincipal();
        } else {
            m.askSenha();
            String senha = in.next();
            in.nextLine();
            if (!cd.buscarLoginSenha(login, senha)) {
                m.senhaIncorreta();
                senha = in.next();
                in.nextLine();
            } else {
                cliente();
            }
        }

    }
    
    public void cliente(){
        do {
            System.out.println("Escolha uma das opções:\n0 - sair\n1 - Ver todos produtos\n2 - Pesquisar por nome\n3 - Pesquisar por tamanho\n4 - Adicionar produtos ao carrinho\n5 - Comprar\n6 - Historico de compras");
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
                    ec.lista_estq();
                    break;
                case '5':
                    ec.lista_estq();
                    break;
                case '6':
                    ec.lista_estq();
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
            }

        } while (op != '0');
    }

    public void loginGerente() {
        m.askMatricula();
        int mat = in.nextInt();
        gd.buscarMatricula(mat);
        gerencia();
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
