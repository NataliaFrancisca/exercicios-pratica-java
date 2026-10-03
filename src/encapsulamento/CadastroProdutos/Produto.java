package encapsulamento.CadastroProdutos;

public class Produto {
    String nome;
    double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0){
            this.preco = 0;
            System.out.println("Preço inválido.");
        } else{
            this.preco = preco;
        }
    }

    public void exibirDetalhes(){
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }
}
