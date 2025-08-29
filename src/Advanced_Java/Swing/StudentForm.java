package Advanced_Java.Swing;

import javax.swing.*;
import java.awt.*;

public class StudentForm extends JFrame {

    // Form components
    JTextField txtFirstName, txtLastName, txtAge;
    JRadioButton rbMale, rbFemale, rbOther;
    JComboBox<String> cbFaculty, cbSemester;
    JTextArea txtRemarks;
    JButton btnSubmit, btnClear;

    public StudentForm() {
        // Frame setup
        setTitle("Asian College - Student Record Form");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout()); // flexible layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // spacing

        // 1. First Name
        gbc.gridx = 0; gbc.gridy = 0; add(new JLabel("First Name:"), gbc);
        txtFirstName = new JTextField(15);
        gbc.gridx = 1; add(txtFirstName, gbc);

        // 2. Last Name
        gbc.gridx = 0; gbc.gridy = 1; add(new JLabel("Last Name:"), gbc);
        txtLastName = new JTextField(15);
        gbc.gridx = 1; add(txtLastName, gbc);

        // 3. Age
        gbc.gridx = 0; gbc.gridy = 2; add(new JLabel("Age:"), gbc);
        txtAge = new JTextField(5);
        gbc.gridx = 1; add(txtAge, gbc);

        // 4. Gender
        gbc.gridx = 0; gbc.gridy = 3; add(new JLabel("Gender:"), gbc);
        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        rbOther = new JRadioButton("Other");
        ButtonGroup bgGender = new ButtonGroup();
        bgGender.add(rbMale);
        bgGender.add(rbFemale);
        bgGender.add(rbOther);
        JPanel genderPanel = new JPanel();
        genderPanel.add(rbMale);
        genderPanel.add(rbFemale);
        genderPanel.add(rbOther);
        gbc.gridx = 1; add(genderPanel, gbc);

        // 5. Faculty (ComboBox)
        gbc.gridx = 0; gbc.gridy = 4; add(new JLabel("Faculty:"), gbc);
        String[] faculties = {"BSc CSIT", "BCA", "BBS", "BBA", "BEd"};
        cbFaculty = new JComboBox<>(faculties);
        gbc.gridx = 1; add(cbFaculty, gbc);

        // 6. Semester (ComboBox)
        gbc.gridx = 0; gbc.gridy = 5; add(new JLabel("Semester:"), gbc);
        String[] semesters = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};
        cbSemester = new JComboBox<>(semesters);
        gbc.gridx = 1; add(cbSemester, gbc);

        // 7. Remarks (TextArea)
        gbc.gridx = 0; gbc.gridy = 6; gbc.anchor = GridBagConstraints.NORTH;
        add(new JLabel("Remarks:"), gbc);
        txtRemarks = new JTextArea(5, 20);
        gbc.gridx = 1; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(new JScrollPane(txtRemarks), gbc);

        // Buttons
        btnSubmit = new JButton("Submit");
        btnClear = new JButton("Clear");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSubmit);
        buttonPanel.add(btnClear);
        gbc.gridx = 1; gbc.gridy = 7; gbc.anchor = GridBagConstraints.CENTER;
        add(buttonPanel, gbc);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentForm::new);
    }
}
