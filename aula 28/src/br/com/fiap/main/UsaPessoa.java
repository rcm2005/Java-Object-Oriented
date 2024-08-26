import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class UsaPessoa {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Registrar pessoa");

        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));

        JLabel instructionJLabel = new JLabel("Digite algo");
        JTextField input = new JTextField();
        JButton submit = new JButton("Submit");

        panel.add(instructionJLabel);
        panel.add(input);
        panel.add(new JLabel());
        panel.add(submit);

        frame.add(panel, BorderLayout.CENTER);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = input.getText(); // Obtém o texto do JTextField
                JOptionPane.showMessageDialog(frame, "Você digitou: " + inputText); // Exibe uma mensagem com o texto digitado
            }
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
