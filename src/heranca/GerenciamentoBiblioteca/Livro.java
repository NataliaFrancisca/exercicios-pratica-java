package br.com.nat.GerenciamentoBiblioteca;

public class Livro extends Midia {
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }
    
    @Override
    public void exibiInfo() {
        var cod = super.gerarCodigoIdentificao();
        System.out.printf("Código: %s | Livro: %s - Autor: %s\n", cod, super.getTitulo(), this.autor);
    }
}
