package heranca.SistemaPagamento;

public class BoletoBancario extends Pagamento {
    private double taxa = 1;

    public BoletoBancario(double valor){
        super(valor);
    }

    public void confirmarPagamento(){
        var taxa = super.calcularTaxa(this.taxa);
        System.out.printf("Boleto de R$ %.2f gerado com sucesso (Taxa: R$ %.2f)\n", super.valor, taxa);
    }
}
