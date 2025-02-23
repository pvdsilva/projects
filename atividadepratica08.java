import java.util.Scanner;

public class atividadepratica08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o salário do funcionário");
        float salario = teclado.nextFloat();
        
        
        System.out.println("Digite a porcentagem de aumento");
        float porcentagem = teclado.nextFloat();
        
        
        porcentagem /= 100;
        
        
        System.out.printf("Salário anterior: R$ %.2f", salario);
        System.out.printf("\n Percentual de aumento: %.2f%%", porcentagem * 100);
        System.out.printf("\n Seu novo salário: R$ %.2f", salario * (1 + porcentagem));
        
        
        System.out.printf("\n Desconto do INSS: R$ %.2f", salario * (1 + porcentagem) * 0.14);
        
        
        System.out.printf("\n Salário Líquido: R$ %.2f", salario * (1 + porcentagem) - salario * (1 + porcentagem) * 0.14);
        
        teclado.close();
    }
}
