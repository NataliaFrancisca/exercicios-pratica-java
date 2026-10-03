package encapsulamento.ControleBancario;

public class Conta {
    String titular;
    double saldo;

    public Conta(String titular){
        this.titular = titular;
    }

    public void depositar(double saldo){
        this.saldo += saldo;
    }

    public void sacar(double saldo){
        if (this.saldo < saldo){
            System.out.println("saldo insuficiente para saque.");
        } else{
            this.saldo -= saldo;
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual de " + titular + ": " + saldo);
    }
}
