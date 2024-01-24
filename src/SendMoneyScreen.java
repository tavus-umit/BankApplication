import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SendMoneyScreen {
    private JButton backButton;
    private JButton sendMoneyButton;
    private JTextField ibanField;
    private JPanel mainPanel;
    private JLabel Amount;
    private JTextField amountField;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void loadButtons()
    {
        this.sendMoneyButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                sendMoneyButton.setForeground(new Color(44,168,251));
                sendMoneyButton.setBackground(new Color(244,240,247));

            }

            @Override
            public void mousePressed(MouseEvent e) {

                sendMoneyButton.setForeground(new Color(244,240,247));
                sendMoneyButton.setBackground(new Color(44,168,251));
                sendMoney();
                resetFields();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                sendMoneyButton.setForeground(new Color(244,240,247));
                sendMoneyButton.setBackground(new Color(44,168,251));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                sendMoneyButton.setForeground(new Color(44,168,251));
                sendMoneyButton.setBackground(new Color(244,240,247));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                sendMoneyButton.setForeground(new Color(244,240,247));
                sendMoneyButton.setBackground(new Color(44,168,251));

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
                goBack();
                resetFields();
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
    public SendMoneyScreen()
    {
        loadButtons();
    }

    private void goBack()
    {
        AppManager.homeScreen.setBalanceLabel(AppManager.signedAccount.getBalanceString());
        AppManager.appFrame.setContentPane(AppManager.homeScreen.getHomePanel());
    }
    private void resetFields()
    {
        this.ibanField.setText("");
        this.amountField.setText("");
    }

    private void sendMoney()
    {
        String receiverIban = ibanField.getText();
        Double amount = Double.parseDouble(amountField.getText());
        Account receiver = findAccount(receiverIban);
        if(receiver == null)
        {
            JOptionPane.showMessageDialog(null, "Sorry, there is not an account found that possesses the entered IBAN", "Fail",
                    JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            receiver.setBalance(receiver.getBalance() + amount);
            AppManager.signedAccount.setBalance(AppManager.signedAccount.getBalance() - amount);
            JOptionPane.showMessageDialog(null, "Money transfer was completed successfully!", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            goBack();
        }


    }
    private Account findAccount(String Iban)
    {
        Account receiver = new Account();
        boolean isAccountFoundInAppManager = false;
        for(int i = 0; i < AppManager.users.size() && !isAccountFoundInAppManager; i++)
        {
            for (int k = 0; k < AppManager.users.get(i).getAccounts().size() && !isAccountFoundInAppManager; k++)
            {
                if(AppManager.users.get(i).getAccounts().get(k).getIban().equals(Iban))
                {
                    receiver = AppManager.users.get(i).getAccounts().get(k);
                    isAccountFoundInAppManager = true;
                }
            }
        }
        if(isAccountFoundInAppManager)
            return receiver;
        else
            return null;
    }
}
