package za.ac.cput.AshDesign.structural.facade;

/**
 * Created by student on 2015/03/10.
 */
public class MoneyInAccount {

    private double moneyInAcc = 500.00;

    public double getMoneyInAcc() {
        return moneyInAcc;
    }

    public void decreaseMoneyInAcc(double moneyDecreased)
    {
        moneyInAcc -= moneyDecreased;
    }

    public void increaseMoneyInAcc(double moneyIncreased)
    {
        moneyInAcc += moneyIncreased;
    }

    public boolean chkEnoughMoney(double moneyToWithDraw)
    {

        if (moneyToWithDraw > getMoneyInAcc())
        {
            System.out.println("Error: No enough money in your account");
            System.out.println("Balance is: " + getMoneyInAcc());
            return false;
        }else
        {
            decreaseMoneyInAcc(moneyToWithDraw);
            System.out.println("Withdrawal complete: + Current balance is " + getMoneyInAcc());
            return true;
        }
    }

    public void depositMoney(double moneyToDeposit)
    {
        increaseMoneyInAcc(moneyToDeposit);
        System.out.println("Deposit complete: + Current Balance is :" + getMoneyInAcc());
    }
}

