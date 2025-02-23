import java.util.Scanner;

public class instruçõesutilizadasnaativadepratica05{
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar dados ao usuário
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();
        
        System.out.print("Digite o nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();
        
        System.out.print("Digite o valor da primeira nota: ");
        double notaA1 = scanner.nextDouble();
        
        System.out.print("Digite o valor da segunda nota: ");
        double notaA2 = scanner.nextDouble();
        
        // Cálculo da média
        double media = (notaA1 + notaA2) / 2;

        // Exibir o relatório final
        System.out.println("************RELATÓRIO FINAL*******");
        System.out.println("Nome d(o/a) Alun(o/a): " + nomeAluno.split(" ")[0]); // Nome do aluno apenas o primeiro nome
        System.out.println("Nome d(o/a) Professor(a): " + nomeProfessor.split(" ")[0]); // Nome do professor apenas o primeiro nome
        System.out.println("Nome da Disciplina: " + nomeDisciplina);
        System.out.printf("Nota A1: %.1f\n", notaA1);
        System.out.printf("Nota A2: %.1f\n", notaA2);
        System.out.printf("Média: %.1f\n", media);
        System.out.println("************FIM DO RELATÓRIO*******");

        // Fechar o scanner
        scanner.close();
    }
}
