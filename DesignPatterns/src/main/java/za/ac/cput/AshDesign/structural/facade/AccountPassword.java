package za.ac.cput.AshDesign.structural.facade;

/**
 * Created by student on 2015/03/10.
 */
public class AccountPassword {

    int password = 55456;

    public AccountPassword (int password)
    {
        this.password = password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public boolean chkAccountPassword(int chkAccPassword)
    {

        if(chkAccPassword == password)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
