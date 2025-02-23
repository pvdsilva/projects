import javax.swing.JFrame;
import javax.swing.JLabel;

public class testeimportarswing {
    public static void main(String[] args) {
        // Cria uma nova janela
        JFrame frame = new JFrame("Exemplo de GUI");
        
        // Cria um componente de texto com a mensagem "Olá, Mundo!"
        JLabel label = new JLabel("Olá, Mundo!", JLabel.CENTER);
        
        // Adiciona o componente de texto à janela
        frame.add(label);
        
        // Define o tamanho da janela
        frame.setSize(800, 400);
        
        // Define a ação de fechar a janela ao clicar no botão de fechar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Torna a janela visível
        frame.setVisible(true);
    }
}

