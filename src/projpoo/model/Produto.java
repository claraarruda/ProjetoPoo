/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpoo;

/**
 *
 * @author clara
 */
public class Produto {
    
    private double preco;
    private final String nome;
    private String cor;
    private int tamanho;

    public Produto(double preco, String nome, String cor, int tamanho) {
        this.preco = preco;
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

       
}
