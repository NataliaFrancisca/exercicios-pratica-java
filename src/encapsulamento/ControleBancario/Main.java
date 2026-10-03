package encapsulamento.ControleBancario;

public class Main {
    static void main() {
        Conta conta = new Conta("ana");
        conta.depositar(100);
        conta.sacar(80);
        conta.exibirSaldo();
        conta.sacar(50);

    }
}
