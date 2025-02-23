import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ElaborandoInterfaceTelaSobreAtividadePratica05 {

    public static void main(String[] args) {
        // Criação do JFrame (janela) e definição do layout
        JFrame frame = new JFrame("Relatório Final");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout()); // Usando GridBagLayout para maior flexibilidade
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);  // Adiciona espaçamento entre os componentes

        // Definir um tamanho mínimo para a janela
        frame.setMinimumSize(new Dimension(400, 400));
        
        // Labels e campos de texto para o nome do aluno, professor e disciplina
        JLabel labelAluno = new JLabel("Nome do Aluno:");
        JTextField campoAluno = new JTextField(20);
        campoAluno.setToolTipText("Insira o nome do aluno");
        
        JLabel labelProfessor = new JLabel("Nome do Professor:");
        JTextField campoProfessor = new JTextField(20);
        campoProfessor.setToolTipText("Insira o nome do professor");
        
        JLabel labelDisciplina = new JLabel("Nome da Disciplina:");
        JTextField campoDisciplina = new JTextField(20);
        campoDisciplina.setToolTipText("Insira o nome da disciplina");

        JLabel labelNotaA1 = new JLabel("Nota A1:");
        JTextField campoNotaA1 = new JTextField(5);
        campoNotaA1.setToolTipText("Insira a Nota A1");
        
        JLabel labelNotaA2 = new JLabel("Nota A2:");
        JTextField campoNotaA2 = new JTextField(5);
        campoNotaA2.setToolTipText("Insira a Nota A2");

        // Botão para gerar o relatório
        JButton gerarRelatorioButton = new JButton("Gerar Relatório");

        // Área de texto para mostrar o relatório
        JTextArea relatorioArea = new JTextArea(10, 30);
        relatorioArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(relatorioArea);

        // Ação do botão "Gerar Relatório"
        gerarRelatorioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validar se todos os campos foram preenchidos
                if (campoAluno.getText().isEmpty() || campoProfessor.getText().isEmpty() ||
                    campoDisciplina.getText().isEmpty() || campoNotaA1.getText().isEmpty() ||
                    campoNotaA2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor, preencha todos os campos.", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Obter dados inseridos nos campos
                String nomeAluno = campoAluno.getText();
                String nomeProfessor = campoProfessor.getText();
                String nomeDisciplina = campoDisciplina.getText();

                // Validar se as notas são números válidos
                double notaA1 = 0, notaA2 = 0;
                try {
                    notaA1 = Double.parseDouble(campoNotaA1.getText());
                    notaA2 = Double.parseDouble(campoNotaA2.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira valores numéricos válidos para as notas.", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Validar se as notas estão dentro do intervalo (0 a 10)
                if (notaA1 < 0 || notaA1 > 10 || notaA2 < 0 || notaA2 > 10) {
                    JOptionPane.showMessageDialog(frame, "As notas devem estar entre 0 e 10.", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Calcular a média
                double media = (notaA1 + notaA2) / 2;

                // Gerar o relatório
                StringBuilder relatorio = new StringBuilder();
                relatorio.append("************ RELATÓRIO FINAL *******\n");
                relatorio.append("Nome d(o/a) Alun(o/a): ").append(nomeAluno.split(" ")[0]).append("\n");
                relatorio.append("Nome d(o/a) Professor(a): ").append(nomeProfessor.split(" ")[0]).append("\n");
                relatorio.append("Nome da Disciplina: ").append(nomeDisciplina).append("\n");
                relatorio.append(String.format("Nota A1: %.1f\n", notaA1));
                relatorio.append(String.format("Nota A2: %.1f\n", notaA2));
                relatorio.append(String.format("Média: %.1f\n", media));
                relatorio.append("************ FIM DO RELATÓRIO *******\n");

                // Exibir o relatório na área de texto
                relatorioArea.setText(relatorio.toString());

                // Limpar os campos de entrada após gerar o relatório
                campoAluno.setText("");
                campoProfessor.setText("");
                campoDisciplina.setText("");
                campoNotaA1.setText("");
                campoNotaA2.setText("");
                
                // Definir o foco no campo "Nome do Aluno"
                campoAluno.requestFocus();
            }
        });

        // Adicionar os componentes à janela com o GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(labelAluno, gbc);

        gbc.gridx = 1;
        frame.add(campoAluno, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(labelProfessor, gbc);

        gbc.gridx = 1;
        frame.add(campoProfessor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(labelDisciplina, gbc);

        gbc.gridx = 1;
        frame.add(campoDisciplina, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(labelNotaA1, gbc);

        gbc.gridx = 1;
        frame.add(campoNotaA1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        frame.add(labelNotaA2, gbc);

        gbc.gridx = 1;
        frame.add(campoNotaA2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;  // O botão ocupa as duas colunas
        frame.add(gerarRelatorioButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;  // A área de texto ocupa as duas colunas
        frame.add(scrollPane, gbc);

        // Ajustar o tamanho da janela e torná-la visível
        frame.pack();
        frame.setVisible(true);
    }
}
