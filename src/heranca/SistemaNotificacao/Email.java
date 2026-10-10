package heranca.SistemaNotificacao;


public class Email extends Notificacao {
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }
    
    @Override
    public void enviar() {
        System.out.println("Enviando Email para: " + super.getDestinatario());
        System.out.println("Assunto: " + assunto);
        System.out.println("Corpo: " + super.getMensagem());
        System.out.println("\n");
    }
}
