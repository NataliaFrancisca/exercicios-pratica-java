package datahora.ControleExpediente;

import java.time.Duration;
import java.time.LocalTime;

public class Main {
    static void main() {
        LocalTime horarioEntrada = LocalTime.of(8, 0);
        long cargaHorariaDiariaHoras = 8;
        long cargaHorariaDiariaMinutos = 0;

        LocalTime horarioSaidaPrevisto = horarioEntrada
                .plusHours(cargaHorariaDiariaHoras)
                .plusMinutes(cargaHorariaDiariaMinutos);

        LocalTime horarioSaida = LocalTime.of(17,45);

        Duration duracao = Duration.between(horarioSaidaPrevisto, horarioSaida);

        String mensagem = "+" + duracao.toHours() + "h " + duracao.toMinutesPart() + "min";

        System.out.printf("""
                Horário de entrada: %s
                Horário de saída previsto: %s
                Horário real de saída: %s
                Saldo de horas: %s
                """, horarioEntrada, horarioSaidaPrevisto, horarioSaida, mensagem);
    }
}
