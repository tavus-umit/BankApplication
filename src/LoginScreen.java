import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginScreen{
    private JTextField identityNumField;
    private long identityNum;
    private long password;
    private JButton loginButton;
    private JPanel LoginScreenPanel;
    private JButton registerButton;
    private JPasswordField passwordField1;

    public JPanel getLoginScreenPanel() {
        return LoginScreenPanel;
    }

    private void logIn()
    {
        User chosenUser;
        identityNum = Long.parseLong(identityNumField.getText());
        password = Long.parseLong(passwordField1.getText());
        boolean userFound = false;
        for (int i = 0 ; (i < AppManager.users.size() && !userFound); i++) {

            chosenUser = AppManager.users.get(i);

            if (chosenUser.getIdentityNum() == identityNum && chosenUser.getPassword() == password) {
                userFound = true;
                AppManager.signedUser = chosenUser;
            }

        }

        if (userFound) {
            JOptionPane.showMessageDialog(null, "Signed In Succesfully!", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            AppManager.accountManagerScreen.setTitleLabel("Welcome " + AppManager.signedUser.getName());
            AppManager.appFrame.setContentPane(AppManager.accountManagerScreen.getAccountManagerPanel());

        }
        else {
            JOptionPane.showMessageDialog(null, "Sorry, user not found", "Alert!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void openRegisterScreen()
    {
        AppManager.appFrame.setContentPane(AppManager.registerScreen.getRegisterPanel());
    }
    private void resetFields()
    {
        this.identityNumField.setText("");
        this.passwordField1.setText("");
    }
    private void loadButtons()
    {
        this.loginButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                loginButton.setForeground(new Color(44,168,251));
                loginButton.setBackground(new Color(244,240,247));
            }

            @Override
            public void mousePressed(MouseEvent e) {

                loginButton.setForeground(new Color(244,240,247));
                loginButton.setBackground(new Color(44,168,251));
                if(identityNumField.getText().equals("") || passwordField1.getPassword().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please enter identity number and password", "Alert!",
                            JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    logIn();
                    resetFields();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                loginButton.setForeground(new Color(244,240,247));
                loginButton.setBackground(new Color(44,168,251));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                loginButton.setForeground(new Color(44,168,251));
                loginButton.setBackground(new Color(244,240,247));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                loginButton.setForeground(new Color(244,240,247));
                loginButton.setBackground(new Color(44,168,251));

            }
        });
        this.registerButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                registerButton.setForeground(new Color(44,168,251));
                registerButton.setBackground(new Color(244,240,247));
            }

            @Override
            public void mousePressed(MouseEvent e) {

                registerButton.setForeground(new Color(244,240,247));
                registerButton.setBackground(new Color(44,168,251));
                openRegisterScreen();
                resetFields();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                registerButton.setForeground(new Color(244,240,247));
                registerButton.setBackground(new Color(44,168,251));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                registerButton.setForeground(new Color(44,168,251));
                registerButton.setBackground(new Color(244,240,247));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                registerButton.setForeground(new Color(244,240,247));
                registerButton.setBackground(new Color(44,168,251));

            }
        });
    }
    public LoginScreen()
    {
        loadButtons();
    }
}
