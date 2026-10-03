package cam;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    public Livro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirInformacoes(){
        System.out.printf("\"%s\" de %s com %d páginas%n", titulo, autor, paginas);
    }
}
