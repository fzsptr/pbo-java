package views;

import controllers.*;
import java.awt.*;
import javax.swing.*;

public class CustomerView {
    private CustomerController customerController;

    public CustomerView(CustomerController customerController) {
        this.customerController = customerController;
        createGUI();
    }

    private void createGUI() {
        JFrame frame = new JFrame("Customer Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (customerController.loginCustomer(username, password)) {
                JOptionPane.showMessageDialog(frame, "Login Successful! Welcome, " + username + "!");
            } else {
                JOptionPane.showMessageDialog(frame, "Login Failed! Silahkan Coba Lagi.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        registerButton.addActionListener(e -> {
            String username = JOptionPane.showInputDialog("Masukkan Username:");
            String password = JOptionPane.showInputDialog("Masukkan Password:");
            String nomorHp = JOptionPane.showInputDialog("Masukkan Nomor Hp:");
            String alamat = JOptionPane.showInputDialog("Masukkan Alamat:");

            customerController.registerCustomer(username, password, nomorHp, alamat);
            JOptionPane.showMessageDialog(frame, "Registration Successful! Silahkan Login.");
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
