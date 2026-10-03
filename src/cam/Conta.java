package cam;

public class Conta {
    double saldo = 0.0;

    public void adicionarSaldo(double saldo){
        this.saldo += saldo;
    }

    public void zerarSaldo(){
        this.saldo = 0.0;
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }
}
