package entity;

import java.util.ArrayList;

public class Livraria {

    private ArrayList<Livro> livros;

    public Livraria() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public Livro buscarLivroPorTitulo(String titulo){
        for (Livro livro: livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        System.out.println("Livro '" + titulo + "' não encontrado");
        return null;
    }
    public void venderLivro(String titulo, int quantidade){
        Livro livro = buscarLivroPorTitulo(titulo);
        if (livro != null){
            double totalVenda = livro.venderLivro(quantidade);
            if (totalVenda > 0){
                System.out.println("Venda realizada: " + quantidade + " unidades de '" + titulo +"'.");
                System.out.println("Venda total: R$ " + totalVenda);
            }
        }
    }

    public void listarLivros(){
        if (livros.isEmpty()){
            System.out.println("Nenhum livro disponível na livraria.");
        }else{
            System.out.println("Livros disponíveis: ");
            for(Livro livro : livros){
                System.out.println("Titulo: " + livro.getTitulo() +", Autor: " + livro.getAutor() + ", Preço: R$: " + livro.getPreco() + ", Estoque: " + livro.getQuantidadeEstoque());
            }
        }
    }
}
