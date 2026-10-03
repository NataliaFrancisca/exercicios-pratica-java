package encapsulamento.SistemaPontos;

public class Aluno {
    private String nome;
    private int pontos;
    private int nivel;

    public Aluno(String nome, int pontos){
        this.nome = nome;
        this.pontos = 0;
        this.nivel = 1;
    }

    public void ganharPontos(Integer pontos){
        this.pontos += pontos;
        atualizarNivel();
    }

    private void atualizarNivel(){
        this.nivel = (pontos / 100) + 1;
    }

    public void exibirStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Pontos: " + pontos);
        System.out.println("Nível: " + nivel);
    }
}
