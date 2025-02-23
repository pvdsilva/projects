import java.util.Scanner;

public class AtividadePratica04 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        // Solicita ao usuário o primeiro número
        System.out.print("Digite o valor do primeiro número: ");
        int num1 = entrada.nextInt();
        
        // Solicita ao usuário o segundo número
        System.out.print("Digite o valor do segundo número: ");
        int num2 = entrada.nextInt();
        
        // Realiza a soma dos dois números
        int resultado = num1 + num2;
        
        // Exibe o resultado da soma
        System.out.println("A soma de " + num1 + " com " + num2 + " resulta em " + resultado);
        
        // Fechar o Scanner
        entrada.close();
    }
}
