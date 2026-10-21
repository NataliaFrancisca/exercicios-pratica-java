package datahora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        LocalDate dataCompra = LocalDate.now(); // retorna data atual
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 5, 15); // data especifica

        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);
        // adicionamos +30 dias em rela~]ao a data que foi informada

        if (dataPrimeiraParcela.isEqual(LocalDate.now())){
            System.out.println("dia do vencimento.");
        } else{
            System.out.println("ainda não está no dia do vencimento.");
        }

        // formato que quero exibir as datas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("Data compra formatada: " + dataCompra.format(formato));

        // orientado a fuso horario
        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data conclusão compra formatada: " + dataConclusaoCompra);
        ZonedDateTime dataConclusaoCompraNY = dataConclusaoCompra
                .withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data conclusão compra formatada (NY): " + dataConclusaoCompraNY);

        LocalTime inicio = LocalTime.of(9,0);
        LocalTime fim = LocalTime.of(17, 36);

        Duration duracao =  Duration.between(inicio, fim);
        System.out.println("Duração entre os horários: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");

        LocalDate dataPagamento = LocalDate.parse("2026-12-30");
        Period periodo = Period.between(dataCompra, dataPagamento);

        // quantidades de dias entre duas datas, mas tem um problema. Ele só faz a subtração dos dias
        // ele ignora se são meses diferentes
        System.out.println("Diferença em dias: " + periodo.getDays());
    }
}
