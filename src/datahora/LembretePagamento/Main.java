package datahora.LembretePagamento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        LocalDate dataVencimento = LocalDate.of(2026, 10, 30);
        LocalDate dataNotificacao = dataVencimento;

        switch (dataVencimento.getDayOfMonth()){
            case 20:
                dataNotificacao = dataVencimento.minusDays(10);
                break;
            case 30:
                dataNotificacao = dataVencimento.minusDays(5);
                break;
        }

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yy");
        System.out.println("Data do lembrete: " + dataNotificacao.format(formato));
    }
}
