package encapsulamento.CadastrarVeiculo;

public class Carro {
    String modelo;
    String placa;
    int ano;

    public Carro(String modelo, String placa, int ano){
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirInformacoes(){
        System.out.println("veículo cadastrado: ");
        System.out.println("modelo: " + this.modelo);
        System.out.println("placa: " + this.placa);
        System.out.println("ano: " + this.ano);
    }
}
