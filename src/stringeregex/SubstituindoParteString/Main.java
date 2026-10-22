package stringeregex.SubstituindoParteString;

public class Main {
    static void main() {
        String texto = "o gato caça o rato.";
        String palavraParaSerSubsituida = "gato";
        String novaPalavra = "cachorro";

        String novoTexto = texto.replace(palavraParaSerSubsituida, novaPalavra);
        System.out.println(novoTexto);
    }
}
