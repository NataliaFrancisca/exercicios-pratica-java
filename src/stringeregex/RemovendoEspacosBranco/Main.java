package stringeregex.RemovendoEspacosBranco;

public class Main {
    static void main() {
        // o trim só remove espaços em branco no começo/fim de uma string
        // então mesmo com esse espaço sobrando no meio das palavras, ele mantem
        // removendo apenas no final e começo
        String umTextoEstranho = "   r e     m o v e n d o    ";
        System.out.println(umTextoEstranho);
        System.out.println(umTextoEstranho.trim());
    }
}
