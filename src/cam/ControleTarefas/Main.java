package cam.ControleTarefas;

public class Main {
    static void main() {
        Tarefas tarefas = new Tarefas();

        tarefas.adicionar(new Tarefa("comer uma coxinha"));
        tarefas.adicionar(new Tarefa("estudar java hoje"));
        tarefas.adicionar(new Tarefa("dormir"));

        tarefas.exibirTodas();

        System.out.println("\n tarefas concluidas");
        tarefas.get(0).tarefaConcluida();
        tarefas.get(1).tarefaConcluida();
        tarefas.get(2).mudarDescricao("jogar amanhã");

        tarefas.exibirTodas();
    }
}
