package heranca.SistemaBancario;

public class Main {
    static void main() {
        OperacaoBancaria deposito = new Deposito(200.0);
        OperacaoBancaria saque = new Saque(50.5);

        deposito.executar();
        saque.executar();
    }
}
