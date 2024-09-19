package entity;

import exception.EstoqueInsuficienteException;
import exception.LivroNaoEncontradoException;

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

    public Livro buscarLivroPorTitulo(String titulo) throws LivroNaoEncontradoException {
        for (Livro livro: livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        throw  new LivroNaoEncontradoException("Livro '" + titulo + "' não encontrado");
    }
    public void venderLivro(String titulo, int quantidade){
        try{
            Livro livro = buscarLivroPorTitulo(titulo);
            double totalVenda = livro.venderLivro(quantidade);
            System.out.println("Venda realizada: " + quantidade + " unidades de '" + titulo +"'.");
        }catch (LivroNaoEncontradoException | EstoqueInsuficienteException e){
            System.out.println("Erro na venda: " + e.getMessage());
        }

    }

    public void listarLivros(){
        if (livros.isEmpty()){
            System.out.println("Nenhum livro disponível na livraria.");
        }else{
            System.out.println("Livros disponíveis: ");
            for(Livro livro : livros){
                System.out.println("Titulo: " + livro.getTitulo() +", Autor: " + livro.getAutor() + ", Preço: R$: " + livro.getPreco() + ", Estoque: " + livro.getQuantidadeEstoque() + ", Categoria: " + livro.getCategoria());
            }
        }
    }
}
