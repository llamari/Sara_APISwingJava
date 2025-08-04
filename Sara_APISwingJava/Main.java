package Sara_APISwingJava;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame FramePai = new JFrame("Formulário Teste");
        FramePai.setSize(400, 330);
        FramePai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel Panel = new JPanel();

        JLabel LabelNome = new JLabel("Nome: ");
        JLabel LabelEmail = new JLabel("E-mail: ");
        JLabel LabelIdade = new JLabel("Idade: ");
        JTextField CampoNome = new JTextField();
        JTextField CampoEmail = new JTextField();
        JTextField CampoIdade = new JTextField(3);

        JButton CadastroButton = new JButton("Cadastrar");
        CadastroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String nome = CampoNome.getText();
                String email = CampoEmail.getText();
                String idade = CampoIdade.getText();
                JOptionPane.showMessageDialog(Panel, "Usuário cadastrado: \nNome: "+nome+"\nE-mail: "+email+"\nIdade: "+idade);
            }
        });
        Panel.setLayout(new GridLayout(0, 1));
        Panel.add(LabelNome);
        Panel.add(CampoNome);
        Panel.add(LabelEmail);
        Panel.add(CampoEmail);
        Panel.add(LabelIdade);
        Panel.add(CampoIdade);
        Panel.add(CadastroButton);

        FramePai.add(Panel);

        FramePai.setLocationRelativeTo(null);
        FramePai.setVisible(true);
    }
}
