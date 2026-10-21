package datahora.DiferencaEntreHoras;

import java.time.Duration;
import java.time.LocalTime;

public class Main {
    static void main() {
        LocalTime horarioInicio = LocalTime.of(14, 30);
        LocalTime horarioFim = LocalTime.of(16, 45);

        Duration duracao = Duration.between(horarioInicio, horarioFim);
        System.out.println("diferença de tempo: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos.");
    }
}
