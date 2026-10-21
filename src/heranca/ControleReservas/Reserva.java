package heranca.ControleReservas;

public class Reserva {
    public void reservar(){
        System.out.println("Reserva realizada");
    }

    public void reservar(String data){
        System.out.println("Reserva feita par ao dia " + data);
    }

    public void reservar(String data, int quantidade){
        System.out.println("Reserva feita para o dia " + data + "para " + quantidade + " pessoas");
    }
}
