package stringeregex.StringContemSubstring;

public class Main {
    static void main() {
        String texto = "o gato caça o rato";
        String palavraBuscar = "gatos";

        if (texto.contains(palavraBuscar)){
            System.out.println("a palavra " + palavraBuscar + " está presente no texto." );
        } else{
            System.out.println("a palavra " + palavraBuscar + " não está presente no texto." );
        }
    }
}
