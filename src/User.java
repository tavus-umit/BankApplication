import java.util.ArrayList;

public class User {

    // Instance Variables
    private String Name;
    private String Surname;
    private long IdentityNum;
    private long Password;
    private ArrayList<Account> Accounts;

    // Constructor
    public User(String Name, String Surname, long IdentityNum, long Password)
    {
        this.Name = Name;
        this.Surname = Surname;
        this.IdentityNum = IdentityNum;
        this.Password = Password;
        this.Accounts = new ArrayList<Account>();
    }
    public User()
    {
        this.Name = "";
        this.Surname = "";
        this.IdentityNum = 0;
        this.Password = 0;
        this.Accounts = new ArrayList<Account>();
    }

    //Setters and Getters
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public long getIdentityNum() {
        return IdentityNum;
    }

    public void setIdentityNum(long identityNum) {
        IdentityNum = identityNum;
    }

    public long getPassword() {
        return Password;
    }

    public void setPassword(long password) {
        Password = password;
    }
    public ArrayList<Account> getAccounts()
    {
        return Accounts;
    }
    public void setAccounts(ArrayList<Account> newAccounts)
    {
        Accounts = newAccounts;
    }
    // Class Methods
    public void createAccount(Account newAccount){
        this.Accounts.add(newAccount);
    }
}
