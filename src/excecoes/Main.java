package excecoes;

public class Main {
    static void main() {
        Adocao adocao = new Adocao("Xuxu", 1, 1010, 233);

        if (adocao.adocaoConcluida){
            System.out.println("adocação concluida.");
        }else{
            throw new AdocaoException("erro na conclusão da adoção");
        }

    }
}
