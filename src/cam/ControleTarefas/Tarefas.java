package cam.ControleTarefas;

import java.util.ArrayList;

public class Tarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(Tarefa tarefa){
        this.tarefas.add(tarefa);
    }

    public Tarefa get(int index){
        return this.tarefas.get(index);
    }

    public void exibirTodas(){
        this.tarefas.forEach(Tarefa::exibir);
    }
}
