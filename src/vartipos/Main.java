package vartipos;

public class Main {
    static void main() {
        // espaços na memorio do computador, usadas para armazenar valores
        // valores que podem ser modificados durante o código
        // valores fixos podemos definir no código, diretamente
        // nome, tipo e valor

        int quantidadePassos = 500;
        double alturaEmMetros = 1.60;

        String nome = "José";

        int alturaEmCentimetros = (int) (alturaEmMetros * 100);
        System.out.println(alturaEmCentimetros);
    }
}
