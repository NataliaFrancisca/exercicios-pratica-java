package vartipos.ClassificacaoCategoria;

public class Main {
    static void main() {
        double preco = 50.10;

        if (preco <= 50) {
            System.out.println("Categoria do produto: Econômico");
        } else if (preco > 50 && preco <= 200){
            System.out.println("Categoria do produto: Intermediário");
        } else {
            System.out.println("Categoria do produto: Premium");
        }
    }
}
