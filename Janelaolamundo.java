import javax.swing.*;  // Importa as classes do Swing
import java.awt.event.*; // Importa a interface para eventos de mouse

public class Janelaolamundo {

    public static void main(String[] args) {
        // Criação da janela (JFrame)
        JFrame janela = new JFrame("Exemplo de Janela com Botão");
        janela.setSize(300, 200);  // Define o tamanho da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao fechar a janela

        // Criação do botão
        JButton botao = new JButton("Clique Aqui!");

        // Adiciona um ouvinte de evento (ActionListener) ao botão
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão clicado!");  // Exibe mensagem no console
            }
        });

        // Adiciona o botão à janela
        janela.getContentPane().add(botao);

        // Torna a janela visível
        janela.setVisible(true);
    }
}