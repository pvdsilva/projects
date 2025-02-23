import java.util.Scanner;

public class atividadepratica08b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Solicitar o salário do funcionário
        System.out.println("Digite o salário do funcionário");
        float salario = teclado.nextFloat();
        
        // Solicitar a porcentagem de aumento
        System.out.println("Digite a porcentagem de aumento");
        float porcentagem = teclado.nextFloat();
        
        // Converter porcentagem de aumento para formato decimal
        porcentagem /= 100;
        
        // Exibir o salário anterior, percentual de aumento e o novo salário
        System.out.printf("Salário anterior: R$ %.2f", salario);
        System.out.printf("\n Percentual de aumento: %.2f%%", porcentagem * 100);
        System.out.printf("\n Seu novo salário: R$ %.2f", salario * (1 + porcentagem));
        
        // Calcular o desconto do INSS (14%)
        System.out.printf("\n Desconto do INSS: R$ %.2f", salario * (1 + porcentagem) * 0.14);
        
        // Calcular o salário líquido (salário com aumento - desconto do INSS)
        System.out.printf("\n Salário Líquido: R$ %.2f", salario * (1 + porcentagem) - salario * (1 + porcentagem) * 0.14);
        
        // Fechar o scanner
        teclado.close();
    }
}
