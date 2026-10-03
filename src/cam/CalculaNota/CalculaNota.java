package cam.CalculaNota;

public class CalculaNota {
    double media;

    public CalculaNota(double media){
        this.media = media;
    }

    private double calcularMedia(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }

    public void exibirSituacaoNota(Aluno aluno){
        var media = this.calcularMedia(aluno.nota1, aluno.nota2);
        var situacao = (media >= 7) ? "Aprovado" : "Reprovado";

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
        System.out.println("\n");
    }
}
