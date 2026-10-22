package stringeregex.ValidandoSenhas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main() {
        String senha = "senhA123@";

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(senha);

        if (matcher.matches()){
            System.out.println("a senha é válida.");
        } else{
            System.out.println("a senha é inválida.");
        }
    }
}
