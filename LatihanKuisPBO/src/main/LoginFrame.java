package main;
import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private final JButton loginButton;
    private String nim = "12345678";

    public LoginFrame() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        panel.add(usernameField);

        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        loginButton = new JButton("Login");
        panel.add(loginButton);

        add(panel);

        loginButton.addActionListener(e -> {
            String inputUsername = usernameField.getText();
            String inputPassword = new String(passwordField.getPassword());
            String reversedNim = new StringBuilder(nim).reverse().toString();

            if (inputUsername.equals(nim) && inputPassword.equals(reversedNim)) {
                new MainFrame(nim);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Login gagal! Coba lagi.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setVisible(true);
    }
}
