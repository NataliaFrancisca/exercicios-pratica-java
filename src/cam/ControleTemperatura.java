package cam;

public class ControleTemperatura {
    String local;
    double temperatura;

    public ControleTemperatura(String local, double temperatura){
        this.local = local;
        this.temperatura = temperatura;
    }

    public void exibirDetalhes(){
        System.out.println("Sensor no local: " + local);
        System.out.printf("Temperatura: %.1f ºC\n", temperatura);

        if (temperatura > 39.2){
            System.out.println("\nAlerta: temperatura acima do limite!\n");
        }
    }
}
