package encapsulamento.ControleBateria;

public class Bateria {
    int nivel;

    public void setNivel(int nivel){
        if (nivel > 0 && nivel < 100){
            this.nivel = nivel;
        }
    }

    public void status(){
        if (this.nivel <= 20){
            System.out.println("Status: Bateria fraca");
        } else if (this.nivel <= 80){
            System.out.println("Status: Bateria ok");
        } else{
            System.out.println("Status: Bateria cheia");
        }
    }
}
