package Sara_APISwingJava;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuario {
    public static void main(String[] args) {
        JFrame FramePai = new JFrame("Formulário Teste"); // cria o frame com um título
        FramePai.setSize(400, 330);
        FramePai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel Panel = new JPanel(); // cria um Panel q é como uma div pra agrupar tudo

        // criação dos labels pro usuário saber oq por aonde
        JLabel LabelNome = new JLabel("Nome: ");
        JLabel LabelEmail = new JLabel("E-mail: ");
        JLabel LabelIdade = new JLabel("Idade: ");

        // criação dos inputs pro usuário digitar
        JTextField CampoNome = new JTextField();
        JTextField CampoEmail = new JTextField();
        JTextField CampoIdade = new JTextField();

        JButton CadastroButton = new JButton("Cadastrar"); // botão de cadastro

        CadastroButton.addActionListener(new ActionListener() { // acontece sempre q o botão de cadastro for clicado
            public void actionPerformed(ActionEvent e) {
                // pega os valores dos inputs
                String nome = CampoNome.getText();
                String email = CampoEmail.getText();
                String idade = CampoIdade.getText();

                if (nome.isBlank() || email.isBlank() || idade.isBlank()) { //verifica se algum input está vazio
                    JOptionPane.showMessageDialog(Panel, "É necessário preencher todas as informações!");
                } else {
                    if (!email.contains("@")) { //verifica se o email contem um @
                        JOptionPane.showMessageDialog(Panel, "O e-mail deve incluir um @");
                    } else {
                        if (!idade.matches("\\d+")) { //verifica se a idade é um numero inteiro
                            JOptionPane.showMessageDialog(Panel, "A idade deve ser um número inteiro");
                        } else {
                            // se não cair em nenhum dos outros, mostra na tela a mensagem com os valores
                            JOptionPane.showMessageDialog(Panel,
                                    "Usuário cadastrado: \nNome: " + nome + "\nE-mail: " + email + "\nIdade: " + idade);
                        }
                    }
                }
            }
        });

        Panel.setLayout(new GridLayout(0, 1)); // faz um ficar em cima do outro soq mais bonitinho

        // coloca todos os labels e inputs no Panel EM ORDEM
        Panel.add(LabelNome);
        Panel.add(CampoNome);
        Panel.add(LabelEmail);
        Panel.add(CampoEmail);
        Panel.add(LabelIdade);
        Panel.add(CampoIdade);
        Panel.add(CadastroButton);

        FramePai.add(Panel); // coloca o Panel no Frame

        // faz o Frame funcionar e aparecer bonitinho
        FramePai.setLocationRelativeTo(null);
        FramePai.setVisible(true);
    }
}
