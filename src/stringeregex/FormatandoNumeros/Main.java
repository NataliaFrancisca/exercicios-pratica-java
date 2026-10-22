package stringeregex.FormatandoNumeros;

public class Main {
    static void main() {
        double valor = 19.9876;
        String valorFormatado = String.format("R$ %.2f", valor);
        System.out.println("valor formatado: " + valorFormatado);
    }
}
