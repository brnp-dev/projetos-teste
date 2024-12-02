import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) {
        // Componente JFrame
        JFrame miJFrame = new JFrame("Cadastro de Livros");
        miJFrame.setSize(500, 300);
        miJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar o programa ao fechar a janela

        // Componente JPanel com GridBagLayout
        JPanel miJPanel = new JPanel();
        miJPanel.setLayout(new GridBagLayout()); // Definir o layout como GridBagLayout

        // Configuração para posicionar os componentes
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL; // Componentes ocupam a largura disponível
        gbc.gridx = 0; // Coluna inicial
        gbc.gridy = 0; // Linha inicial
        gbc.anchor = GridBagConstraints.WEST; // Alinhar os componentes à esquerda

        // Label e campo de texto para Autor
        JLabel autorLabel = new JLabel("Autor: ");
        JTextArea autorArea = new JTextArea(1, 20);
        miJPanel.add(autorLabel, gbc); // Adiciona o JLabel "Autor"
        
        gbc.gridy++; // Move para a próxima linha
        miJPanel.add(autorArea, gbc); // Adiciona o JTextArea do Autor

        // Label e campo de texto para Título
        JLabel tituloLabel = new JLabel("Título: ");
        gbc.gridy++; // Move para a próxima linha
        miJPanel.add(tituloLabel, gbc); // Adiciona o JLabel "Título"

        gbc.gridy++; // Move para a próxima linha
        JTextArea tituloArea = new JTextArea(1, 20);
        miJPanel.add(tituloArea, gbc); // Adiciona o JTextArea do Título

        // Conectar JPanel ao JFrame
        miJFrame.add(miJPanel);

        // Tornar visível o JFrame
        miJFrame.setVisible(true);
    }
}
