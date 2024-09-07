package entity;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;
    private int quantidadeEstoque;

    public Livro(String titulo, String autor, double preco, int quantidadeEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
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

    public double venderLivro(int quantidade){

        if(quantidade <= this.quantidadeEstoque){
            this.quantidadeEstoque -= quantidade;
            return  quantidade * this.preco;
        }else {
            System.out.println("Estoque insuficiente. Apenas " + getQuantidadeEstoque() + " unidades disponiveis.");
            return 0;
        }
    }

    public void adicionarEstoque(int quantidade){
        if (quantidade > 0){
            this.quantidadeEstoque += quantidade;
            System.out.println("Estoque atualizado: " + getQuantidadeEstoque());
        }
    }
}
