package stringeregex;

public class Strings {
    static void main() {
        String professor = "jacqueline oliveira";

        String disciplina = "java e programação orientada a objetos";

        String curriculo = """
                Pós graduada em Engenharia e
                Arquitetura de Software
                Desenvolvedora Backend Java
                """;

        System.out.println(professor);
        System.out.println(disciplina);
        System.out.println("\n" + curriculo);

        // indicar que vou subistituir esse %s por alguma outra variavel ou texto diretamente
        String texto = String.format("Disciplina: %s - %s", disciplina, professor);
        System.out.println(texto);

        System.out.printf("Nome: %s %nDisciplina: %s", professor, disciplina);
    }
}
