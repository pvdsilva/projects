import java.util.Scanner;

public class atividadepratica07 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double soma = num1 + num2;
            double subtracao = num1 - num2;
            double multiplicacao = num1 * num2;
            double divisao = num1 / num2;

            System.out.println("O resultado da soma de: " + num1 + " + " + num2 + " = " + soma);
            System.out.println("O resultado da subtração de: " + num1 + " - " + num2 + " = " + subtracao);
            System.out.println("O resultado da multiplicação de: " + num1 + " x " + num2 + " = " + multiplicacao);
            System.out.println("O resultado da divisão de: " + num1 + " / " + num2 + " = " + divisao);
        } 
    }
}
