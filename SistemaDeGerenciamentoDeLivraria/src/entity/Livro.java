package entity;

import enun.Categoria;
import exception.EstoqueInsuficienteException;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;
    private int quantidadeEstoque;
    private Categoria categoria;

    public Livro(String titulo, String autor, double preco, int quantidadeEstoque, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Categoria getCategoria(){
        return  categoria;
    }
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public double venderLivro(int quantidade) throws EstoqueInsuficienteException {

        if(quantidade <= this.quantidadeEstoque){
            this.quantidadeEstoque -= quantidade;
            return  quantidade * this.preco;
        }else {
            throw new EstoqueInsuficienteException("Estoque insuficiente. Apenas " + getQuantidadeEstoque() + " unidades disponiveis.");
        }
    }

    public void adicionarEstoque(int quantidade){
        if (quantidade > 0){
            this.quantidadeEstoque += quantidade;
            System.out.println("Estoque atualizado: " + getQuantidadeEstoque());
        }else{
            System.out.println("A quantidade deve ser maior que 0.");
        }
    }
}
