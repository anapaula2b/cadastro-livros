public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setNome("O Hobitt");
        livro1.setGenero("Fantasia");
        livro1.setNomeAutor("J.R.R Tolkien");
        livro1.setAnoPublicacao(1937);

        livro1.abrir();
        livro1.status();
        livro1.ler();
    }
}
