package datahora.CalculandoDataEntrega;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        LocalDate dataInicio = LocalDate.now();
        int prazoEmDias = 10;

        LocalDate dataEntrega = dataInicio.plusDays(prazoEmDias);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yy");

        System.out.println("Data de entrega: " + dataEntrega.format(formato));


    }
}
