import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class AccountManagerScreen {
    private JPanel AccountManagerPanel;
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JButton createAccountButton;
    private JButton chooseAccountButton;
    private JButton logOutButton;

    public JPanel getAccountManagerPanel() {
        return AccountManagerPanel;
    }

    public void setTitleLabel(String text) {
        this.titleLabel.setText(text);
    }

    private void openAccountList()
    {
        AppManager.viewAccountListScreen.loadAccounts();
        AppManager.appFrame.setContentPane(AppManager.viewAccountListScreen.getMainPanel());
    }
    private void logOut()
    {
        AppManager.appFrame.setContentPane(AppManager.loginScreen.getLoginScreenPanel());
        AppManager.signedUser = new User();
    }
    private void loadButtons()
    {
        this.createAccountButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createAccountButton.setForeground(new Color(44,168,251));
                createAccountButton.setBackground(new Color(244,240,247));
                createAccountButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\plus.PNG"));


            }

            @Override
            public void mousePressed(MouseEvent e) {

                createAccountButton.setForeground(new Color(244,240,247));
                createAccountButton.setBackground(new Color(44,168,251));
                createAccountButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\add.PNG"));
                AppManager.appFrame.setContentPane(AppManager.createAccountScreen.getMainPanel());

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                createAccountButton.setForeground(new Color(244,240,247));
                createAccountButton.setBackground(new Color(44,168,251));
                createAccountButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\add.PNG"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                createAccountButton.setForeground(new Color(44,168,251));
                createAccountButton.setBackground(new Color(244,240,247));
                createAccountButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\plus.PNG"));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                createAccountButton.setForeground(new Color(244,240,247));
                createAccountButton.setBackground(new Color(44,168,251));
                createAccountButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\add.PNG"));

            }
        });
        this.chooseAccountButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                chooseAccountButton.setForeground(new Color(44,168,251));
                chooseAccountButton.setBackground(new Color(244,240,247));
                chooseAccountButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\checkBlue.PNG"));
            }

            @Override
            public void mousePressed(MouseEvent e) {

                chooseAccountButton.setForeground(new Color(244,240,247));
                chooseAccountButton.setBackground(new Color(44,168,251));
                chooseAccountButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\check.PNG"));
                openAccountList();

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                chooseAccountButton.setForeground(new Color(244,240,247));
                chooseAccountButton.setBackground(new Color(44,168,251));
                chooseAccountButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\check.PNG"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                chooseAccountButton.setForeground(new Color(44,168,251));
                chooseAccountButton.setBackground(new Color(244,240,247));
                chooseAccountButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\checkBlue.PNG"));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                chooseAccountButton.setForeground(new Color(244,240,247));
                chooseAccountButton.setBackground(new Color(44,168,251));
                chooseAccountButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\check.PNG"));

            }
        });
        this.logOutButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                logOutButton.setForeground(new Color(44,168,251));
                logOutButton.setBackground(new Color(244,240,247));
                logOutButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\logout.PNG"));
            }

            @Override
            public void mousePressed(MouseEvent e) {

                logOutButton.setForeground(new Color(244,240,247));
                logOutButton.setBackground(new Color(44,168,251));
                logOutButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\logoutWhite.PNG"));
                logOut();

            }

            @Override
            public void mouseReleased(MouseEvent e) {

                logOutButton.setForeground(new Color(244,240,247));
                logOutButton.setBackground(new Color(44,168,251));
                logOutButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\logoutWhite.PNG"));

            }

            @Override
            public void mouseEntered(MouseEvent e) {

                logOutButton.setForeground(new Color(44,168,251));
                logOutButton.setBackground(new Color(244,240,247));
                logOutButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\logout.PNG"));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                logOutButton.setForeground(new Color(244,240,247));
                logOutButton.setBackground(new Color(44,168,251));
                logOutButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\logoutWhite.PNG"));

            }
        });
    }

    public AccountManagerScreen()
    {
        loadButtons();
    }
}
