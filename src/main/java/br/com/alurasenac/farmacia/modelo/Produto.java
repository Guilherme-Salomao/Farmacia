package br.com.alurasenac.farmacia.modelo;

public class Produto {
    private int id;
    private double preco;
    private String nome;
    private String fabricante;

    public double getPreco() {
        return preco;
    }

    public Produto(double preco, String nome, String fabricante) {
        this.preco = preco;
        this.nome = nome;
        this.fabricante = fabricante;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "preco=" + preco +
                ", nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
