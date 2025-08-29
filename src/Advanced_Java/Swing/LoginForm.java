package Advanced_Java.Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginForm extends JFrame implements ActionListener {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
    private JLabel resultLabel;
    public LoginForm() {
        setTitle("Login Form - FlowLayout");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        add(new JLabel("Username:"));
        userField = new JTextField(15);
        add(userField);
        add(new JLabel("Password:"));
        passField = new JPasswordField(15);
        add(passField);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);
        resultLabel = new JLabel("");
        add(resultLabel);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passField.getPassword());
        if (username.equals("admin") && password.equals("admin")) {
            resultLabel.setText("Access Granted");
        } else {
            resultLabel.setText("Access Denied");
        }
    }
    public static void main(String[] args) {
        new LoginForm();
    }
}
