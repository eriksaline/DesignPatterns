package za.ac.cput.AshDesign.structural.facade;

/**
 * Created by student on 2015/03/10.
 */
public class BankFacade {

    private int accountNo;
    private int password;

    AccountNumber accNo;
    AccountPassword accPass;
    MoneyInAccount mia;

    public BankFacade (int accountNo, int password)
    {
        this.accountNo = accountNo;
        this.password = password;

        accNo = new AccountNumber(accountNo);
        accPass = new AccountPassword(password);
        mia = new MoneyInAccount();
    }

    public int getAccountNo() {
        return accountNo;
    }

    public int getPassword() {
        return password;
    }

    public void withdrawMoney(double MoneyToGet)
    {
        if(accNo.checkAccountNo(getAccountNo()) && accPass.chkAccountPassword(getPassword()) &&
                mia.chkEnoughMoney(MoneyToGet))
        {

            System.out.println("Cash withdrawal complete\n");
        }else
        {
            System.out.println("Cash withdrawal failed");
        }

    }

    public void depositMoney (double depositMoney)
    {
        if(accNo.checkAccountNo(getAccountNo()) && accPass.chkAccountPassword(getPassword()))
        {
            mia.chkEnoughMoney(depositMoney);
            System.out.println("Cash deposit complete\n");

        }else
        {
            System.out.println("Cash deposit failed");
        }

    }

}
