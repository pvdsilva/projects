import java.util.Scanner;

public class préviaatividadeprática9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Usando o nome correto para o Scanner
        System.out.println("Digite o tamanho da base: ");
        float base = scanner.nextFloat(); // Corrigido de "teclado" para "scanner"
        System.out.println("Digite o tamanho da altura: ");
        float altura = scanner.nextFloat(); // Corrigido de "teclado" para "scanner"
        
        float area = base * altura; // Calculando a área

        // Verificando se é um quadrado ou retângulo
        if (base == altura) {
            System.out.println("O quadrado com base " + base + " e altura " + altura + " tem área: " + area);
        } else {
            System.out.println("O retângulo com base " + base + " e altura " + altura + " tem área: " + area);
        }
        
        scanner.close(); // Fechando o scanner
    }
}