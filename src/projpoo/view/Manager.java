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

    public void askNome() {
        System.out.println("Digite o nome: ");
    }

    public boolean validarNome(String n) {
        return n.matches("[A-Z][a-z]+([ ][A-Z][a-z]+)*");
    }

    public void nomeInvalido() {
        System.out.println("Seu nome não pode conter números, acentos ou caracteres especiais.");
    }

    public void askEmail() {
        System.out.println("Digite o email: ");
    }

    public void askData(){
        System.out.println("Digite a data de nascimento: ");
    }
            
    public void askEndereco(){
        System.out.println("Digite o endereço: ");
    }
    
    public void askLogin(){
        System.out.println("Digite o login: ");
    }
    
    public void askSenha(){
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
    
    public void askTamanho(){
        System.out.println("Digite o tamanho do calçado: ");
    }
    
    public void askPreco(){
        System.out.println("Digite o preço do calçado: ");
    }
    
    public void askCor(){
        System.out.println("Digite a cor predominante: ");
    }

    public void askMatricula(){
        System.out.println("Digite a matricula: ");
    }
    
}
