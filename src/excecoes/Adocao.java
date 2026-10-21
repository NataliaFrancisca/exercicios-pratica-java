package excecoes;

public class Adocao {
    String nome;
    Integer id;
    Integer idPet;
    Integer idResponsavel;
    boolean adocaoConcluida;

    public Adocao(String nome, Integer id, Integer idPet, Integer idResponsavel){
        this.nome = nome;
        this.id = id;
        this.idPet = idPet;
        this.idResponsavel = idResponsavel;
        this.adocaoConcluida = false;
    }

    public void setAdocaoConcluida() {
        this.adocaoConcluida = true;
    }
}
