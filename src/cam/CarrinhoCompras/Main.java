package cam.CarrinhoCompras;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto pa = new Produto("teclado", 120, 1);
        Produto pb = new Produto("mouse", 60, 2);

        produtos.add(pa);
        produtos.add(pb);

        double totalCompra = produtos
                .stream()
                .mapToDouble(Produto::calcularPrecoTotal)
                .sum();

        System.out.println("Total da compra: R$ " + totalCompra);
    }
}
