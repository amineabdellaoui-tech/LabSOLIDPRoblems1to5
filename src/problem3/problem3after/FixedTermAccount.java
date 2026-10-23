package problem3.problem3after;

public class FixedTermAccount implements Account{
    protected double balance;

    public FixedTermAccount(double balance){
        this.balance=balance;
    }

    @Override
    public void deposit(double amount){
        this.balance+=amount;
    }

    @Override
    public double getBalance(){
        return this.balance;
    }
}
