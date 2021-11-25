public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.nome = "O Hobitt";
        livro1.genero = "Fantasia";
        livro1.nomeAutor = "J.R.R Tolkien";
        livro1.abrir();

        livro1.ler();
        livro1.status();
    }
}
