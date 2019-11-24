/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo.view;

/**
 *
 * @author clara
 */
public class Manager {

    public void boasVindas(){
        System.out.println("BEM VINDO!\n\nGreatWalk\n>>>> Maior loja de calçados de toda Internet <<<<\n");
    }
    
    public void senhaIncorreta(){
        System.out.println("Senha incorreta! Digite: ");
    }
    
    public void askNome() {
        System.out.println("Digite o nome: ");
    }

    public void askEmail() {
        System.out.println("Digite o email: ");
    }
    
    public void askPagamento(){
        System.out.println("Digite o tipo de pagamento: ");
    }

    public void askData() {
        System.out.println("Digite a data de nascimento: ");
    }

    public void askEndereco() {
        System.out.println("Digite o endereço: ");
    }

    public void askLogin() {
        System.out.println("Digite o login: ");
    }

    public void askSenha() {
        System.out.println("Digite a senha: ");
    }

    public void askTelefone() {
        System.out.println("Digite o telefone: ");
    }

    public boolean validarTelefone(String t) {
        return t.matches("[0-9]{10,11}");
    }

    public void telefoneInvalido() {
        System.out.println("Seu telefone deve conter apenas números e iniciar com o código de área.");
    }

    public void OpInvalida() {
        System.out.println("Opção inválida.\nPor favor, digite novamente: ");
    }

    public void askCpf() {
        System.out.println("Por favor, digite seu CPF: ");
    }

    public boolean validaCpf(String cpf) {
        ValidaCpf v = new ValidaCpf();
        return cpf.matches("[0-9]{11}") && v.validarCpf(cpf);
    }

    public void askTamanho() {
        System.out.println("Digite o tamanho do calçado: ");
    }

    public void askPreco() {
        System.out.println("Digite o preço do calçado: ");
    }

    public void askCor() {
        System.out.println("Digite a cor predominante: ");
    }

    public void askMatricula() {
        System.out.println("Digite a matricula: ");
    }

    public void listaVazia() {
        System.out.println("A lista está vazia! 0 cadastros.");
    }

    public void naoEncontrado() {
        System.out.println("Não encontrado!");
    }

    public void removido() {
        System.out.println("Removido com sucesso!");
    }

    public void naoRemovido() {
        System.out.println("Remoção invalida");
    }
    
    public void askQuantidade(){
        System.out.println("Digite a quantidade: ");
    }

}
