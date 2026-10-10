package br.com.nat.GerenciamentoBiblioteca;

public class Main {
    public static void main(String[] args) {
        Midia livro = new Livro("Tudo sobre o amor", 2026,  "Bell Hooks");
        Midia revista = new Revista("Vogue", 2025, 901);
        Midia ebook = new Ebook("Como programar em java", 2003, "PDF");

        livro.exibiInfo();
        revista.exibiInfo();
        ebook.exibiInfo();
    }
    
}
