package encapsulamento.AvaliacaoFilme;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private ArrayList<Integer> avaliacoes;

    public Filme(String titulo){
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(Integer avaliacao){
        if (avaliacao >= 1 && avaliacao <= 5){
            this.avaliacoes.add(avaliacao);
        } else{
            System.out.println("avaliação inválida.");
        }
    }

    private double calcularMedia(){
        int soma = 0;

        for (int nota : avaliacoes){
            soma += nota;
        }

        return (double) soma / this.avaliacoes.size();
    }

    public void exibirMedia(){
        var media = calcularMedia();
        System.out.printf("Média de avaliação para %s: %.2f\n", this.titulo, media);
    }
}
