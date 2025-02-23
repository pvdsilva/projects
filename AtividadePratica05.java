import java.util.Scanner;

public class AtividadePratica05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();
        
        System.out.print("Digite o nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();
        
        System.out.print("Digite o valor da primeira nota: ");
        double notaA1 = scanner.nextDouble();
        
        // Consumir a linha em branco que fica no buffer após nextDouble()
        scanner.nextLine();  // Corrige o problema de leitura da próxima linha
        
        System.out.print("Digite o valor da segunda nota: ");
        double notaA2 = scanner.nextDouble();
        
        // Consumir a linha em branco após o segundo nextDouble()
        scanner.nextLine();  // Corrige novamente o problema de leitura da próxima linha
        
        double media = (notaA1 + notaA2) / 2;

        // Exibe o relatório
        System.out.println("************RELATÓRIO FINAL*******");
        System.out.println("Nome d(o/a) Alun(o/a): " + nomeAluno.split(" ")[0]); // Nome do aluno apenas o primeiro nome
        System.out.println("Nome d(o/a) Professor(a): " + nomeProfessor.split(" ")[0]); // Nome do professor apenas o primeiro nome
        System.out.println("Nome da Disciplina: " + nomeDisciplina);
        System.out.printf("Nota A1: %.1f\n", notaA1);
        System.out.printf("Nota A2: %.1f\n", notaA2);
        System.out.printf("Média: %.1f\n", media);
        System.out.println("************FIM DO RELATÓRIO*******");

        scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
    }
}