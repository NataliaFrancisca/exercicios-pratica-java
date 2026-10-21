package datahora.FusoHorario;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    static void main() {
        ZonedDateTime horaAtual = ZonedDateTime.now();
        ZonedDateTime horaAtualTokio = horaAtual
                .withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println("Hora atual: " + horaAtual);
        System.out.println("Hora atual em Tokio: " + horaAtualTokio);
    }
}
