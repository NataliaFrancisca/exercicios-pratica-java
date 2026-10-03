package cam.ControleEstoque;

public class Produto {
    String nome;
    int quantidade;

    public Produto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void vender(int quantidade){

        if (this.quantidade < quantidade){
            System.out.println("Estoque insuficiente.");
        } else{
            this.quantidade -= quantidade;
            System.out.println("Venda realizada. Estoque restante de " + this.nome + ": " + this.quantidade);
        }
    }
}
