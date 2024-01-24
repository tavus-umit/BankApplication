import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ViewAccountListScreen {
    private JPanel mainPanel;
    private JList<Account> accountList;
    private DefaultListModel<Account> accountDefaultListModel;
    private JPanel buttonPanel;
    private JButton backButton;
    private JButton confirmButton;
    private JButton deleteButton;
    private JPanel listPanel;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void deleteAccount()
    {
        Account deletedAccount = this.accountList.getSelectedValue();
        this.accountDefaultListModel.removeElement(deletedAccount);
        AppManager.signedUser.getAccounts().remove(deletedAccount);
    }

    private void confirmAccount()
    {
        AppManager.signedAccount = this.accountList.getSelectedValue();
        AppManager.homeScreen.setWelcomeLabel("Welcome " + AppManager.signedUser.getName());
        if(AppManager.signedAccount != null)
        {
            AppManager.homeScreen.setBalanceLabel((AppManager.signedAccount.getBalanceString()));
            AppManager.homeScreen.setIbanLabel(AppManager.signedAccount.getIban());
        }
        AppManager.appFrame.setContentPane(AppManager.homeScreen.getHomePanel());
    }

    private void goBack()
    {
        AppManager.appFrame.setContentPane(AppManager.accountManagerScreen.getAccountManagerPanel());
    }
    public void loadAccounts()
    {
        this.accountList.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        this.accountDefaultListModel = new DefaultListModel<>();
        this.accountList.setModel(this.accountDefaultListModel);
        if(AppManager.signedUser != null)
        {
            for (int i = 0 ; i < AppManager.signedUser.getAccounts().size() ; i++)
            {
                this.accountDefaultListModel.addElement(AppManager.signedUser.getAccounts().get(i));
            }
        }

    }

    private void loadButtons()
    {
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

        this.confirmButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                confirmButton.setBackground(new Color(244,240,247));
                confirmButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\checkBlue.PNG"));

            }


            @Override
            public void mousePressed(MouseEvent e) {

                confirmButton.setBackground(new Color(44,168,251));
                confirmButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\check.PNG"));
                confirmAccount();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                confirmButton.setBackground(new Color(44,168,251));
                confirmButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\check.PNG"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                confirmButton.setBackground(new Color(244,240,247));
                confirmButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\checkBlue.PNG"));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                confirmButton.setBackground(new Color(44,168,251));
                confirmButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\check.PNG"));

            }
        });

        this.deleteButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                deleteButton.setBackground(new Color(244,240,247));
                deleteButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\crossBlue.PNG"));
            }

            @Override
            public void mousePressed(MouseEvent e) {

                deleteButton.setBackground(new Color(44,168,251));
                deleteButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\crossWhite.PNG"));
                deleteAccount();

            }

            @Override
            public void mouseReleased(MouseEvent e) {

                deleteButton.setBackground(new Color(44,168,251));
                deleteButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\crossWhite.PNG"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                deleteButton.setBackground(new Color(244,240,247));
                deleteButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\crossBlue.PNG"));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                deleteButton.setBackground(new Color(44,168,251));
                deleteButton.setIcon(new ImageIcon("C:\\Users\\ÜMİT\\Desktop\\BankApplication\\src\\icons\\crossWhite.PNG"));

            }
        });
    }

    public ViewAccountListScreen()
    {
        loadButtons();
    }
}
