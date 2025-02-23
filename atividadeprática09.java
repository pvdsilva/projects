import java.util.Scanner;

public class atividadeprática09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Digite o tamanho da base: ");
        float base = scanner.nextFloat(); 
        System.out.println("Digite o tamanho da altura: ");
        float altura = scanner.nextFloat(); 
        
        float area = base * altura; 

       
        if (base == altura) {
            System.out.println("O quadrado com base " + base + " e altura " + altura + " tem área: " + area);
        } else {
            System.out.println("O retângulo com base " + base + " e altura " + altura + " tem área: " + area);
        }
        
        scanner.close(); 
    }
}