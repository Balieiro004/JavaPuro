import entity.Livraria;
import entity.Livro;

public class Main {
    public static void main(String[] args) {

        Livraria livraria = new Livraria();

        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "J.K Rowling", 35.5, 20);
        Livro livro2 = new Livro("O Senhor dos anéis - A sociedade do anel", "J.R.R. Tolkien", 40, 10);
        Livro livro3 = new Livro("Harry Potte e a Câmara Secreta", "J.K Rowling", 55.5, 40);



        livraria.adicionarLivro(livro1);
        livraria.adicionarLivro(livro2);
        livraria.adicionarLivro(livro3);
        System.out.println("");

        livraria.listarLivros();
        System.out.println("");

        livraria.venderLivro("Harry Potter e a Pedra Filosofal", 2);
        System.out.println("");
        livraria.venderLivro("O Senhor dos anéis - A sociedade do anel", 11);
        System.out.println("");
        livraria.venderLivro("Este livro não existe", 1);
        System.out.println("");

        livraria.listarLivros();



    }
}