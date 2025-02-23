import java.util.Scanner;

public class atividadepratica10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número: ");
        double n1 = teclado.nextDouble();
        
        System.out.println("Insira o segundo número: ");
        double n2 = teclado.nextDouble();
        
        if(n1 == n2){
            System.out.printf("O valor 1 %.2f é igual ao valor 2 %.2f%n", n1, n2);
        } else if (n1 > n2) {
            System.out.printf("O valor %.2f é maior do que o valor %.2f%n", n1, n2);
        } else {
            System.out.printf("O valor %.2f é maior do que o valor %.2f%n", n2, n1);
        }
        
        teclado.close(); // Fechar o scanner após o uso
    }
}