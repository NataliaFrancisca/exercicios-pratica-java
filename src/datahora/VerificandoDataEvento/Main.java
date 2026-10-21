package datahora.VerificandoDataEvento;

import java.time.LocalDate;

public class Main {
    static void main() {
        LocalDate dataEvento = LocalDate.of(2026,11,3);
        LocalDate dataAtual = LocalDate.now();

        if (dataEvento.isBefore(dataAtual)){
            System.out.println("o evento já ocorreu.");
        } else{
            System.out.println("o evento ainda vai acontecer.");
        }
    }
}
