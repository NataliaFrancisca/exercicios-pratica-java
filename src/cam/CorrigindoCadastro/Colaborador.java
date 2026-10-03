package cam.CorrigindoCadastro;

public class Colaborador {
    String nome;
    String cargo;
    Integer nivelAcesso;

    public Colaborador(String nome, String cargo, int nivelAcesso){
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    private void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Nível de acesso: " + this.nivelAcesso);
        System.out.println("\n");
    }

    public void atualizar(String cargo, int nivelAcesso){
        this.exibirDados();

        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;

        this.exibirDados();
    }
}
