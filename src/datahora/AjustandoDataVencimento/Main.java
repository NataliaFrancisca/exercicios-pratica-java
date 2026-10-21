package datahora.AjustandoDataVencimento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        LocalDate dataOriginal = LocalDate.of(2026, 10, 31);
        int mesesParaVencimento = 3;

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yy");
        LocalDate dataModificada = dataOriginal.plusMonths(mesesParaVencimento);

        System.out.println("nova data de vencimento: " + dataModificada.format(formato));
    }
}
