package encapsulamento.ControleSenha;

public class Usuario {
    private String senha;

    public Usuario(String senha){
        this.senha = senha;
    }

    public void setSenha(String senhaAntiga, String senhaNova){
        if (senha.equalsIgnoreCase(senhaAntiga)){
            this.senha = senhaNova;
            System.out.println("Senha alterada com sucesso!");
        } else{
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }
}
