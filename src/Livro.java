public class Livro {
    String nome;
    String nomeAutor;
    String genero;
    int anopublicacao;
    boolean aberto;

    void status(){
        System.out.println(this.nome);
    }
    void abrir(){
        this.aberto = true;
    }
    void fechar(){
        this.aberto = false;
    }
    void ler(){
        if (this.aberto == true) {
            System.out.println("Pode ler o livro");
        }else {
            System.out.println("Não pode ler o livro");
        }
    }

    void marcar(){

    }
}
