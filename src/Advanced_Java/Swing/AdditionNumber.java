package Advanced_Java.Swing;

import javax.swing.*;

public class AdditionNumber {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vishwas GC Add");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel label1 = new JLabel("Number 1");
        label1.setBounds(20, 20, 80, 25);
        frame.add(label1);

        JLabel label2 = new JLabel("Number 2");
        label2.setBounds(20, 50, 80, 25);
        frame.add(label2);

        JLabel resultLabel = new JLabel("Result");

        resultLabel.setBounds(20, 110, 80, 25);
        frame.add(resultLabel);
        // Create Button
        JButton addButton = new JButton("Add");

        addButton.setBounds(100, 80, 150, 25);
        frame.add(addButton);

        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();
        JTextField result = new JTextField();

        text1.setBounds(100, 20, 150, 25);
        frame.add(text1);

        text2.setBounds(100, 50, 150, 25);
        frame.add(text2);

        result.setBounds(100, 110, 150, 25);
        frame.add(result);
        result.setEditable(false);

        addButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double product = num1 + num2;
                result.setText(String.valueOf(product));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Incorrect number format");
            }
        });
        frame.setVisible(true);
    }
}
