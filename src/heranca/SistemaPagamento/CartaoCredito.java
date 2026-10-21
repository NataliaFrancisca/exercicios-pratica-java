package heranca.SistemaPagamento;

public class CartaoCredito extends Pagamento {
    private double taxa = 3;

    public CartaoCredito(double valor) {
        super(valor);
    }

    public void confirmarPagamento(){
        var taxa = super.calcularTaxa(this.taxa);
        System.out.printf("Pagamento de R$ %.2f confirmado no Cartão de Crédito (Taxa: R$ %.2f)\n", super.valor, taxa);
    }
}
