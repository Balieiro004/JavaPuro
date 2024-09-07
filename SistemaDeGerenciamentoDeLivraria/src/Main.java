import entity.Livraria;
import entity.Livro;

public class Main {
    public static void main(String[] args) {

        Livraria livraria = new Livraria();

        Livro livro = new Livro("Harry Potter", "J.K Rowling", 35.5, 20);

        livro.adicionarEstoque(10);

        livraria.adicionarLivro(livro);

        livraria.buscarLivroPorTitulo("Senhor dos anéis");

        livraria.venderLivro("Harry Potter", 2);

        livraria.listarLivros();


    }
}