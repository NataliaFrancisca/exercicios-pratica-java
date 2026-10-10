package br.com.nat.GerenciamentoBiblioteca;

public abstract class Midia{
    private String titulo;
    private int anoPublicacao;

    public Midia(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String gerarCodigoIdentificao(){
        return "LIB-"
            .concat(titulo.strip().substring(0, 3).toUpperCase())
            .concat(String.valueOf(anoPublicacao));
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public abstract void exibiInfo();
}