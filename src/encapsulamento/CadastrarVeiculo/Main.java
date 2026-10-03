package encapsulamento.CadastrarVeiculo;

public class Main {
    static void main() {
        Carro gol = new Carro("Gol", "ABC-1234", 2020);
        Carro uno = new Carro("Uno", "DEF-2233", 2001);

        gol.exibirInformacoes();
        uno.exibirInformacoes();
    }
}
