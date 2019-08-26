package task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** Main class */
public class Main {
    public static void main(String[] args) {
        /**Create a chat window*/
        JFrame frame = new JFrame("Мой чат.");
        frame.setSize(400, 450);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        /**Create a content panel*/
        JPanel contents = new JPanel(new FlowLayout());
        /**Create a text output field*/
        TextArea textOut = new TextArea(20,50);
        textOut.setEditable(false);
        /**Create a button to enter a message*/
        JButton buttonIn = new JButton("Отправить сообщение.");
        /**Create a message input field*/
        JLabel jLabel1 = new JLabel("Напишите что нибудь.");
        TextField textIn = new TextField(50);

        /**A listener to the button input message*/
        ActionListener inner = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String x = textIn.getText();
                String y = textOut.getText();
                textOut.append(" - " + x + "\n");
                textIn.setText(null);
            }
        };
        /**The listener of button ENTER*/
        textIn.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER ) {
                    String x = textIn.getText();
                    textOut.append(" - " + x + "\n");
                    textIn.setText(null);
                }
            }
        });

        /**Add everything to the main window, make it visible.*/
        contents.add(textOut);
        contents.add(jLabel1);
        contents.add(textIn);
        contents.add(buttonIn);
        buttonIn.addActionListener(inner);
        frame.setContentPane(contents);
        frame.setVisible(true);
    }
}