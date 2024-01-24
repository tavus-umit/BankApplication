import javax.swing.*;
import java.util.ArrayList;

public class AppManager {
    protected static LoginScreen loginScreen = new LoginScreen();
    protected static RegisterScreen registerScreen = new RegisterScreen();
    protected static HomeScreen homeScreen = new HomeScreen();
    protected static AccountManagerScreen accountManagerScreen = new AccountManagerScreen();
    protected static CreateAccountScreen createAccountScreen = new CreateAccountScreen();
    protected static ViewAccountListScreen viewAccountListScreen = new ViewAccountListScreen();
    protected static SendMoneyScreen sendMoneyScreen = new SendMoneyScreen();

    protected static User signedUser = new User();
    protected static Account signedAccount = new Account();
    protected static JFrame appFrame = new JFrame();
    protected static ArrayList<User> users= new ArrayList<User>();

    private static void run()
    {
        appFrame.setTitle("Bank Application");
        appFrame.setSize(750,750);
        appFrame.setContentPane(loginScreen.getLoginScreenPanel());
        appFrame.setVisible(true);
        appFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        appFrame.setResizable(false);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {

        }

    }
    public static void main(String[] args) {

        AppManager.run();
    }
}