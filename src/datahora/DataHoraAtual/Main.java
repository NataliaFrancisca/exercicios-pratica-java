package datahora.DataHoraAtual;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy");

        System.out.println("Data atual: " + dataAtual.format(formato));
        System.out.println("Hora atual: " + horaAtual);
    }
}
