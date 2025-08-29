package Advanced_Java.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class NotePadApp extends JFrame implements ActionListener {
    JTextArea textArea;
    JButton btnNew, btnOpen, btnSave, btnExit;

    public NotePadApp() {
        setTitle("Basic Notepad");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);
        JPanel panel = new JPanel();
        btnNew = new JButton("New");
        btnOpen = new JButton("Open");
        btnSave = new JButton("Save");
        btnExit = new JButton("Exit");
        btnNew.addActionListener(this);
        btnOpen.addActionListener(this);
        btnSave.addActionListener(this);
        btnExit.addActionListener(this);
        panel.add(btnNew);
        panel.add(btnOpen);
        panel.add(btnSave);
        panel.add(btnExit);
        add(panel, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNew) {
            textArea.setText(""); // Clear text
        } else if (e.getSource() == btnOpen) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                try (BufferedReader br = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                    textArea.read(br, null);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error opening file");
                }
            }
        } else if (e.getSource() == btnSave) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()))) {
                    textArea.write(bw);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error saving file");
                }
            }
        } else if (e.getSource() == btnExit) {
            System.exit(0); // Exit app
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new NotePadApp().setVisible(true);
        });
    }
}
