import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aula6 {

    public static void main(String[] args) {
        // Solicita ao usuário seu nome através de uma caixa de entrada
        String nome = JOptionPane.showInputDialog(null, "Digite seu Nome", "Nome", JOptionPane.QUESTION_MESSAGE);

        // Chama a criação e exibição da interface gráfica (JFrame)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(nome);  // Passa o nome para a interface gráfica
            }
        });
    }

    // Método que cria a janela e exibe a interface gráfica
    private static void createAndShowGUI(String nome) {
        // Criação da janela (JFrame)
        JFrame f = new JFrame("Swing Olá Mundo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Comportamento ao fechar a janela
        f.setSize(250, 250);  // Define o tamanho da janela
        f.setVisible(true);  // Torna a janela visível

        // Criação do rótulo (JLabel) e adição à janela
        JLabel label = new JLabel("Olá, " + nome, SwingConstants.CENTER);  // Exibe o nome inserido
        f.add(label);  // Adiciona o rótulo à janela
    }
}
