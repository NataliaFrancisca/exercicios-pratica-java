package cam.ControleEstoque;

public class Main {
    static void main() {
        Produto pA = new Produto("Camiseta", 10);
        Produto pB = new Produto("Shorts", 20);

        pA.vender(8);
        pA.vender(2);
        pA.vender(2);

        pB.vender(19);
        pB.vender(23);
    }
}
