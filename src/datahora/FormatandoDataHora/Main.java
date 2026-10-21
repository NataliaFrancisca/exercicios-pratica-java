package datahora.FormatandoDataHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data atual: " + dataAtual.format(formatoData));
        System.out.println("Hora atual: " + horaAtual.format(formatoHora));
    }
}
