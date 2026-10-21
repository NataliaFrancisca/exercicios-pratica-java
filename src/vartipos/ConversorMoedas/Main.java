package vartipos.ConversorMoedas;

public class Main {
    static void main() {
        double valorReais = 451.50;
        double taxaCambio = 5.25;
        // R$5.25 = US$1

        double valorDolar = valorReais / taxaCambio;

        System.out.println("O valor em dólares é: U$ " + valorDolar);

    }
}
