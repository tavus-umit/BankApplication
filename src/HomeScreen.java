import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HomeScreen {
    private JPanel homePanel;
    private JPanel mainPanel;
    private JPanel sideMenuPanel;
    private JButton listButton;
    private JPanel titlePanel;
    private JPanel sidePanel;
    private JLabel balanceLabel;
    private JLabel welcomeLabel;
    private JPanel balancePanel;
    private JButton sendMoneyButton;
    private JButton logOutButton;
    private JPanel ibanPanel;
    private JButton copyIbanButton;
    private JLabel ibanLabel;

    public JPanel getHomePanel() {
        return homePanel;
    }

    public void setBalanceLabel(String newText) {
        this.balanceLabel.setText(newText);
    }

    public void setWelcomeLabel(String newText) {
        this.welcomeLabel.setText(newText);
    }

    public void setIbanLabel(String newText) {
        this.ibanLabel.setText(newText);
    }

    private void loadButtons()
    {
        this.sendMoneyButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                sendMoneyButton.setForeground(new Color(244,240,247));
                sendMoneyButton.setBackground(new Color(44,168,251));
                sendMoneyButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\moneyWhite.PNG"));

            }

            @Override
            public void mousePressed(MouseEvent e) {

                sendMoneyButton.setForeground(new Color(44,168,251));
                sendMoneyButton.setBackground(new Color(244,240,247));
                sendMoneyButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\money.PNG"));
                openSendMoneyScreen();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                sendMoneyButton.setForeground(new Color(44,168,251));
                sendMoneyButton.setBackground(new Color(244,240,247));
                sendMoneyButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\money.PNG"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                sendMoneyButton.setForeground(new Color(244,240,247));
                sendMoneyButton.setBackground(new Color(44,168,251));
                sendMoneyButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\moneyWhite.PNG"));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                sendMoneyButton.setForeground(new Color(44,168,251));
                sendMoneyButton.setBackground(new Color(244,240,247));
                sendMoneyButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\money.PNG"));

            }
        });
        this.listButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                listButton.setForeground(new Color(244,240,247));
                listButton.setBackground(new Color(44,168,251));
                listButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\listWhite.PNG"));

            }

            @Override
            public void mousePressed(MouseEvent e) {

                listButton.setForeground(new Color(44,168,251));
                listButton.setBackground(new Color(244,240,247));
                listButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\list.PNG"));
                openAccountList();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                listButton.setForeground(new Color(44,168,251));
                listButton.setBackground(new Color(244,240,247));
                listButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\list.PNG"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                listButton.setForeground(new Color(244,240,247));
                listButton.setBackground(new Color(44,168,251));
                listButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\listWhite.PNG"));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                listButton.setForeground(new Color(44,168,251));
                listButton.setBackground(new Color(244,240,247));
                listButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\list.PNG"));

            }
        });

        this.logOutButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                logOutButton.setForeground(new Color(244,240,247));
                logOutButton.setBackground(new Color(44,168,251));
                logOutButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\logoutWhite.PNG"));

            }

            @Override
            public void mousePressed(MouseEvent e) {

                logOutButton.setForeground(new Color(44,168,251));
                logOutButton.setBackground(new Color(244,240,247));
                logOutButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\logout.PNG"));
                logOut();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                logOutButton.setForeground(new Color(44,168,251));
                logOutButton.setBackground(new Color(244,240,247));
                logOutButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\logout.PNG"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                logOutButton.setForeground(new Color(244,240,247));
                logOutButton.setBackground(new Color(44,168,251));
                logOutButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\logoutWhite.PNG"));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                logOutButton.setForeground(new Color(44,168,251));
                logOutButton.setBackground(new Color(244,240,247));
                logOutButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\logout.PNG"));

            }
        });

        this.copyIbanButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                copyIbanButton.setForeground(new Color(244,240,247));
                copyIbanButton.setBackground(new Color(44,168,251));
                copyIbanButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\copyWhite.PNG"));

            }

            @Override
            public void mousePressed(MouseEvent e) {

                copyIbanButton.setForeground(new Color(44,168,251));
                copyIbanButton.setBackground(new Color(244,240,247));
                copyIbanButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\copyBlue.PNG"));
                copyIban();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                copyIbanButton.setForeground(new Color(44,168,251));
                copyIbanButton.setBackground(new Color(244,240,247));
                copyIbanButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\copyBlue.PNG"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                copyIbanButton.setForeground(new Color(244,240,247));
                copyIbanButton.setBackground(new Color(44,168,251));
                copyIbanButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\copyWhite.PNG"));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                copyIbanButton.setForeground(new Color(44,168,251));
                copyIbanButton.setBackground(new Color(244,240,247));
                copyIbanButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\copyBlue.PNG"));

            }
        });
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

    private void openSendMoneyScreen()
    {
        AppManager.appFrame.setContentPane(AppManager.sendMoneyScreen.getMainPanel());
    }

    private void copyIban()
    {
        String copiedIban = this.ibanLabel.getText();
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection strSel = new StringSelection(copiedIban);
        clipboard.setContents(strSel,strSel);
        JOptionPane.showMessageDialog(null, "IBAN was copied successfully!", "Success",
                JOptionPane.INFORMATION_MESSAGE);

    }
    public HomeScreen ()
    {
        loadButtons();
    }
}
