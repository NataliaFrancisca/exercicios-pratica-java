package stringeregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexs {
    static void main() {
        String texto = "meu email é jaq@alura.com.br";
        // como verificar se tem um padrão de email?
        // pattern -> padrão da nossa expessão
        // match -> se atende esse pattern

        // w+ uma ococrrencia de um alfanumerico
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");
        // verificar se no meu texto tem esse padrao

        Matcher matcher = pattern.matcher(texto);
        if (matcher.find()){
            // ele só retorna o padrão que foi atingido
            // então o .br no final não é exibido
            System.out.println(matcher.group());
        }

        System.out.println(formatarTelefone("2199887744"));
        System.out.println(formatarTelefone("1120203434"));
    }
     static String formatarTelefone(String telefone){
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if (matcher.matches()){
            return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }

        return "Número de telefone inválido";
    }
}


