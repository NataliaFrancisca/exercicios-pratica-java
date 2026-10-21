package heranca.EnviandoMensagens;

public class Notificacao {

    public void enviarMensagem(){
        System.out.println("Mensagem enviada para todos: Olá!");
    }

    public void enviarMensagem(String contato, String mensagem){
        System.out.printf("Mensagem para %s: %s\n", contato, mensagem);
    }

    public void enviarMensagem(String contato, String mensagem, int quantidade){
        for (int i = 0; i < quantidade; i++) {
            this.enviarMensagem(contato, mensagem);
        }
    }
}
