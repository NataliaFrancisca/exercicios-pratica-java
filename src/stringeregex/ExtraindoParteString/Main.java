package stringeregex.ExtraindoParteString;

public class Main {
    static void main() {
        String nomeArquivo = "relatorio_final.pdf";

        try{
            int indexUltimoCaractereAntesDoTipoArquivo = nomeArquivo.indexOf(".");
            String nomeArquivoSemExtensao = nomeArquivo.substring(0, indexUltimoCaractereAntesDoTipoArquivo);

            System.out.println("nome do arquivo: " + nomeArquivoSemExtensao);
        } catch (Exception e) {
            System.out.println("o arquivo não possui extensão.");
        }
    }
}
