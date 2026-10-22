package stringeregex.ExtraindoHashTags;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main() {
        String texto = "Olá #mundo! estou aprendendo #java e #programação";

        String regex = "#\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        ArrayList<String> hashtags = new ArrayList<>();

        while (matcher.find()){
            hashtags.add(matcher.group());
        }

        if (hashtags.isEmpty()){
            System.out.println("nenhuma hashtag encontrada.");
        } else{
            System.out.println("hashtags encontradas: " + String.join(", ", hashtags));
        }

    }
}
