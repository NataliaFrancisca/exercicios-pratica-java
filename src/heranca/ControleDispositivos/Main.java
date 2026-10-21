package heranca.ControleDispositivos;

public class Main {
    static void main() {
        Luz luz = new Luz();
        ArCondicionado ar = new ArCondicionado();

        luz.ligar();
        luz.desligar();
        luz.desligar();

        ar.desligar();
    }
}
