package encapsulamento.ValidacaoLogin;

public class Usuario {
    String acesso;
    String senha;
    int tentativas = 3;

    public Usuario(String acesso, String senha){
        this.acesso = acesso;
        this.senha = senha;
    }

    public boolean validarSenha(String acesso, String senha){
        return this.acesso.equals(acesso) && this.senha.equals(senha);
    }

    public String getAcesso() {
        return acesso;
    }
}
