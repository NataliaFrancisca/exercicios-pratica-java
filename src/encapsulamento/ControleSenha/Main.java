package encapsulamento.ControleSenha;

public class Main {
    static void main() {
        Usuario usuario = new Usuario("123456");
        usuario.setSenha("1234567", "minhasenhanova123");
        usuario.setSenha("123456", "minhasenhanova123");
    }
}
