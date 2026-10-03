package cam;

public class Funcionario {
    public String nome;
    public String cargo;
    public double salario;

    public void exibirInformacoes(){
        System.out.printf("cam.Funcionario: %s - Cargo: %s - Salário: %.2f", nome, cargo, salario);
    }

    public void reajustarSalario(double percentual){
        salario += salario * (percentual / 100);
        System.out.printf("novo salario de %s é %.2f", nome, salario);
        System.out.println("/n");
    }
}
