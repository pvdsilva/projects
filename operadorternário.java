import java.util.Scanner;

public class operadorternário {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira valor 1: ");
        int valor1 = entrada.nextInt();
        System.out.println("Insira valor 2: ");
        int valor2 = entrada.nextInt();
        
        // Usando operador ternário para comparar os valores e gerar a mensagem
        String resultado = valor1 > valor2 
                           ? "Valor 1 (" + valor1 + ") é maior que valor 2 (" + valor2 + ") pois valor 1 é maior."
                           : (valor1 < valor2 
                              ? "Valor 2 (" + valor2 + ") é maior que valor 1 (" + valor1 + ") pois valor 2 é maior."
                              : "Valor 1 (" + valor1 + ") e valor 2 (" + valor2 + ") são iguais.");
        
        // Exibindo o resultado
        System.out.println(resultado);
        
        entrada.close(); // Fechar o scanner após o uso
    }
}
