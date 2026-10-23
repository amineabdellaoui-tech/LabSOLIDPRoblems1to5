package problem3.problem3after;

public class StudentAccount extends CurrentAccount{
    public StudentAccount(double balance){
        super(balance);
    }

    @Override
    public void withdraw(double amount){
        if (amount > balance){
            throw new IllegalArgumentException("Insufficient funds");
        } else if (amount<=200) {
            balance-=amount;
        }
    }
}
