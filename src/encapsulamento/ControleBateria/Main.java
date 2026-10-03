package encapsulamento.ControleBateria;

public class Main {
    static void main() {
        Bateria bateria = new Bateria();
        bateria.setNivel(80);
        bateria.status();

        bateria.setNivel(21);
        bateria.status();

        bateria.setNivel(5);
        bateria.status();
    }
}
