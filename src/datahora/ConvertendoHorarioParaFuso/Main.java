package datahora.ConvertendoHorarioParaFuso;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        ZonedDateTime horaAtual = ZonedDateTime.now();
        ZonedDateTime horaAtualTokio = horaAtual
                .withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Hora atual: " + horaAtual.format(formato));
        System.out.println("Hora atual em Sydney: " + horaAtualTokio.format(formato));
    }
}
