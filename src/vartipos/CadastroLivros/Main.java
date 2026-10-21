package vartipos.CadastroLivros;

public class Main {
    static void main() {
        String titulo = "O Pequeno Príncipe";
        String autor = "Antoin de Saint-Exupéry";
        int paginas = 96;
        double preco = 39.90;
        char categoria = 'F';

        String categoriaDescricao;

        switch (categoria){
            case 'F':
                categoriaDescricao = "Ficção";
                break;
            case 'N':
                categoriaDescricao = "Não-ficção";
                break;
            case 'T':
                categoriaDescricao = "Tecnologia";
                break;
            case 'H':
                categoriaDescricao = "História";
                break;
            default:
                categoriaDescricao = "Categoria inválida";
        }

        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + paginas + " páginas, custa R$" + preco + " e pertence à categoria " + categoriaDescricao + ".");
    }
}
