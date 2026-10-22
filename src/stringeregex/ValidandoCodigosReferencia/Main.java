package stringeregex.ValidandoCodigosReferencia;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main() {
        String regex = "(^[A-Z]{3}-\\d{4}$)";
        Pattern pattern = Pattern.compile(regex);

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("digite o código de referência (para verificar):");
            String codigo = scanner.nextLine();

            Matcher matcher = pattern.matcher(codigo);

            if (codigo.equals("sair")){
                break;
            }else if (matcher.matches()){
                System.out.println("o código de referência está válido.");
            } else{
                System.out.println("código está inválido.");
            }
        }


    }
}
