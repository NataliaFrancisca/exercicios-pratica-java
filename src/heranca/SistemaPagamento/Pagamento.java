package heranca.SistemaPagamento;

public class Pagamento {
    protected double valor = 0;

    public Pagamento(double valor){
        this.valor = valor;
    }

    protected double calcularTaxa(double taxa){
        return (taxa * this.valor) / 100;
    }

    void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado\n",
                valor, calcularTaxa(0));
    }
}
