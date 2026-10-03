package cam.ControleTarefas;

public class Tarefa {
    String descricao;
    boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }

    void exibir(){
        if (concluida){
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        } else{
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
        }
    }

    public void mudarDescricao(String descricao){
        this.descricao = descricao;
    }

    public void tarefaConcluida(){
        this.concluida = true;
    }

    public void tarefaPendente(){
        this.concluida = false;
    }
}
