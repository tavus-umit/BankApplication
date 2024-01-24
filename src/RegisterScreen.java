import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class RegisterScreen{
    private JPanel registerPanel;
    private JTextField nameField;
    private JTextField surnameField;
    private JTextField IdField;
    private JPasswordField passwordField;
    private JButton registerButton;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel IdLabel;
    private JLabel passwordLabel;
    private JButton backButton;
    private JPanel contentsPanel;

    public JPanel getRegisterPanel() {
        return registerPanel;
    }

    private void loadButtons()
    {
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
                if (nameField.getText().equals("") || surnameField.getText().equals("") || IdField.getText().equals("") || passwordField.getPassword().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please fill all the blanks to register", "Alert!",
                            JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    register();
                }
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
        this.backButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                backButton.setBackground(new Color(244,240,247));
                backButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\backBlue.PNG"));
            }

            @Override
            public void mousePressed(MouseEvent e) {

                backButton.setBackground(new Color(44,168,251));
                backButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\backWhite.PNG"));
                goBackLoginScreen();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                backButton.setBackground(new Color(44,168,251));
                backButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\backWhite.PNG"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                backButton.setBackground(new Color(244,240,247));
                backButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\backBlue.PNG"));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                backButton.setBackground(new Color(44,168,251));
                backButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\backWhite.PNG"));

            }
        });
    }
    private void register()
    {
        String name = nameField.getText();
        String surname = surnameField.getText();
        Long Id = Long.parseLong(IdField.getText());
        Long password = Long.parseLong(passwordField.getText());

        boolean isSameIDFound = false;
        for(int i = 0 ; i < AppManager.users.size() && !isSameIDFound ; i++)
        {
            if(AppManager.users.get(i).getIdentityNum() == Id)
                isSameIDFound = true;
        }

        if(isSameIDFound)
        {
            JOptionPane.showMessageDialog(null, "Sorry, There is another user found as registered with same identity number. Try with different identity number", "Alert!",
                    JOptionPane.ERROR_MESSAGE);
        }

        else {
            try {
                User newUser = new User(name, surname, Id, password);
                AppManager.users.add(newUser);

                JOptionPane.showMessageDialog(null, "You are registered succesfully!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                goBackLoginScreen();
                resetFields();
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Sorry, We cannot register you right now. Try again later!", "Alert!",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void goBackLoginScreen()
    {
        AppManager.appFrame.setContentPane(AppManager.loginScreen.getLoginScreenPanel());
    }

    private void resetFields()
    {
        this.nameField.setText("");
        this.surnameField.setText("");
        this.IdField.setText("");
        this.passwordField.setText("");
    }

    public RegisterScreen()
    {
        loadButtons();
    }
}
