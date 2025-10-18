package watchdemoprilozhka;

import javax.swing.*;
import java.awt.*;

public class Login {
    public static boolean show() {
        JTextField textField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);

        JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));
        panel.add(new JLabel("Логин:"));
        panel.add(textField);
        panel.add(new JLabel("Пароль:"));
        panel.add(passwordField);

        int result = JOptionPane.showConfirmDialog(
                null,
                panel,
                "Вход в систему",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            String username = textField.getText();
            String password = new String(passwordField.getPassword());
            System.out.println("Логин: " + username + ", Пароль: " + password);
            return true;
        }
        return false;
    }
}