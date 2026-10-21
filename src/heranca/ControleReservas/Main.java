package heranca.ControleReservas;

public class Main {
    static void main() {
        Reserva r = new Reserva();
        r.reservar();
        r.reservar("10/04");
        r.reservar("12/04", 4);

        Reserva vip = new ReservaVip();
        vip.reservar();
    }
}
