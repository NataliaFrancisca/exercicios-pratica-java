package cam.MultaAtraso;

public class Main {
    static void main() {
        Pedido pedido1 = new Pedido("Dom Casmurro");
        pedido1.implementarAtraso();
        pedido1.implementarAtraso();
        pedido1.implementarAtraso();
        pedido1.exibirDetalhes();

        Pedido pedido2 = new Pedido("Tudo Sobre o Amor");
        pedido2.implementarAtraso();
        pedido2.exibirDetalhes();
    }
}
