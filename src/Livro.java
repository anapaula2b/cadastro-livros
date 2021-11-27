public class Livro {
    public String nome;
    public String nomeAutor;
    public String genero;
    public int anoPublicacao;
    private boolean aberto;

    public Livro(){
        this.fechar();
        this.setGenero("Ficção");
    }
    public void status() {

        System.out.println(this.getNome());
        System.out.println(this.getNomeAutor());
        System.out.println(this.getGenero());
        System.out.println(this.getAnoPublicacao());
        System.out.println(this.getAberto());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
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

}