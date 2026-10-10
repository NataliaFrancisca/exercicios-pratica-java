package br.com.nat.GerenciamentoBiblioteca;

public class Ebook extends Midia {
    private String formato;

    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    @Override
    public void exibiInfo() {
        var cod = super.gerarCodigoIdentificao();
        System.out.printf("Código: %s | Ebook: %s - Formato: %s\n", cod, super.getTitulo(), this.formato);
    }
}
