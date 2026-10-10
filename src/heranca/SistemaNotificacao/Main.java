package heranca.SistemaNotificacao;

public class Main {
    public static void main(String[] args) {
        Notificacao email = new Email("nat@mail.com", "hi! how are you?", "Everthing good?");
        Notificacao push = new Push("ntfrancisca", "this photo is nice....", "amazing");
        Notificacao sms = new SMS("(11) 99999-2020", "WHERE ARE YOU?");

        email.enviar();
        push.enviar();
        sms.enviar();
    }
}
