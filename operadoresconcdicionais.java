import java.util.Scanner;

public class operadoresconcdicionais {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        // Solicita a primeira nota
        System.out.println("Insira a nota 1: ");
        double nota1 = entrada.nextDouble();

        // Solicita a segunda nota
        System.out.println("Insira a nota 2: ");
        double nota2 = entrada.nextDouble();

        // Calcula a média
        double media = (nota1 + nota2) / 2;

        // Verifica a média e imprime o resultado
        if (media >=6) {
            System.out.println("Parabéns, Aprovado.");
        } else if (media >= 3 && media <= 5) {
            System.out.println("Você está de exame.");
        } else if (media <= 2) {
            System.out.println("Você está reprovado");
        }
        // Fecha o scanner
        entrada.close();
    }
}
