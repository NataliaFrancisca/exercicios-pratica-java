package br.com.nat.GerenciamentoBiblioteca;

public class Revista extends Midia {
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }
    
        @Override
    public void exibiInfo() {
        var cod = super.gerarCodigoIdentificao();
        System.out.printf("Código: %s | Revista: %s - Edição: %s\n", cod, super.getTitulo(), this.edicao);
    }
}
