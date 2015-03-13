package za.ac.cput.AshDesign.structural.facade;

/**
 * Created by student on 2015/03/10.
 */
public class AccountNumber {

    int accountNo = 1285454641;

    public AccountNumber(int accountNo)
    {
        this.accountNo = accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public boolean checkAccountNo(int chkAccountNo)
    {
        if (chkAccountNo == accountNo)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
