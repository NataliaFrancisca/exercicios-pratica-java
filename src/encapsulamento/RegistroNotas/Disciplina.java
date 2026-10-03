package encapsulamento.RegistroNotas;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String disciplina;
    private List<Integer> notasValidas;
    private List<Integer> notasInvalidas;

    public Disciplina(String disciplina){
        this.disciplina = disciplina;
        this.notasValidas = new ArrayList<>();
        this.notasInvalidas = new ArrayList<>();
    }

    public void adicionar(Integer nota){
        if (nota >= 0 && nota <= 10){
            notasValidas.add(nota);
        } else{
            notasInvalidas.add(nota);
        }
    }

    private double getMedia(){
        var soma = this.notasValidas.stream().mapToInt(i -> i).sum();
        return (double) soma / notasValidas.size();
    }

    public void detalhes(){
        this.notasInvalidas.forEach(nota -> {
            System.out.println("Nota inválida ignorada: " + nota);
        });
        System.out.println("Total de notas válidas: " + this.notasValidas.size());
        System.out.println("Média em Matemática: " + this.getMedia());
    }
}
