package cam.MultaAtraso;

public class Pedido {
    String titulo;
    int diasAtraso;

    double calcularMulta(){
        return diasAtraso * 2.50;
    }

    public Pedido(String titulo){
        this.titulo = titulo;
    }

    public void implementarAtraso(){
        this.diasAtraso += 1;
    }

    public void exibirDetalhes(){
        var multa = this.calcularMulta();
        System.out.printf("""
                Livro: %s | Multa por %d dias de atraso: R$ %.2f
                """, this.titulo, this.diasAtraso, multa);
    }
}
