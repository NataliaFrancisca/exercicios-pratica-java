package stringeregex.ValidandoCPF;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static void main() {
        String cpf = "123.456.789-09";
        String regex = "\\d{3}.\\d{3}.\\d{3}-\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.matches()){
            System.out.println("O " + cpf + " está no formato válido.");
        } else{
            System.out.println("o CPF não está no formato válido.");
        }
    }
}
