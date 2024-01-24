import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CreateAccountScreen {
    private JPanel mainPanel;
    private JButton backButton;
    private JButton createAccountButton;
    private JTextField nameField;

    private void loadButtons()
    {
        this.backButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                backButton.setBackground(new Color(244,240,247));
                backButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\backBlue.PNG"));
                resetFields();
                goBack();
            }

            @Override
            public void mousePressed(MouseEvent e) {

                backButton.setBackground(new Color(44,168,251));
                backButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\backWhite.PNG"));
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

        this.createAccountButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                createAccountButton.setForeground(new Color(44,168,251));
                createAccountButton.setBackground(new Color(244,240,247));
                createAccountForSignedUser();
                resetFields();
                goBack();

            }

            @Override
            public void mousePressed(MouseEvent e) {

                createAccountButton.setForeground(new Color(244,240,247));
                createAccountButton.setBackground(new Color(44,168,251));
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                createAccountButton.setForeground(new Color(244,240,247));
                createAccountButton.setBackground(new Color(44,168,251));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                createAccountButton.setForeground(new Color(44,168,251));
                createAccountButton.setBackground(new Color(244,240,247));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                createAccountButton.setForeground(new Color(244,240,247));
                createAccountButton.setBackground(new Color(44,168,251));

            }
        });
    }


    public JPanel getMainPanel() {
        return mainPanel;
    }
    private void createAccountForSignedUser()
    {
        String accountName = nameField.getText();
        Account newAccount = new Account(accountName);

        for(int i = 0; i < AppManager.users.size(); i++)
        {
            boolean backFlag = false;
            for (int k = 0; k < AppManager.users.get(i).getAccounts().size() && !backFlag; k++)
            {
                if(newAccount.getIban().equals(AppManager.users.get(i).getAccounts().get(k)))
                {
                    newAccount.setIban(newAccount.ibanGenerator());
                    backFlag = true;
                    i = 0; k = 0;
                }
            }
        }

        AppManager.signedUser.createAccount(newAccount);
        JOptionPane.showMessageDialog(null, "Account is created succesfully!", "Success",
                JOptionPane.INFORMATION_MESSAGE);

    }
    private void resetFields()
    {
        this.nameField.setText("");
    }
    private void goBack()
    {
        AppManager.appFrame.setContentPane(AppManager.accountManagerScreen.getAccountManagerPanel());
    }

    public CreateAccountScreen()
    {
        loadButtons();
    }

}


