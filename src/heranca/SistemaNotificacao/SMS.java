package heranca.SistemaNotificacao;

public class SMS extends Notificacao {
    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }
    
    @Override
    public void enviar() {
        System.out.println("Enviando SMS para: " + super.getDestinatario());
        System.out.println("Mensagem: " + super.getMensagem());
        System.out.println("\n");
    }
}