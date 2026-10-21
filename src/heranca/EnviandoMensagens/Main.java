package heranca.EnviandoMensagens;

public class Main {
    static void main() {
        Notificacao notificacao = new Notificacao();
        notificacao.enviarMensagem();
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção!", 2);
    }
}
