import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            // Solicita ao usuário os valores
            System.out.print("Insira o valor 1: ");
            int n1 = teclado.nextInt();
            System.out.print("Insira o valor 2: ");
            int n2 = teclado.nextInt();

            // Usando operador ternário para determinar o maior valor
            int maior = n1 > n2 ? n1 : n2;

            // Exibe o resultado
            System.out.println("O maior valor é: " + maior);
        } catch (Exception e) {
            // Caso o usuário insira um valor não numérico
            System.out.println("Erro: Por favor, insira valores numéricos válidos.");
        } finally {
            // Fechar o scanner para evitar vazamento de recursos
            teclado.close();
        }
    }
}
