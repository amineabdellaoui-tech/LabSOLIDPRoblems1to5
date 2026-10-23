package problem3.problem3after;

public class Test {
    public static void main(String[] args){
        CurrentAccount currentAccount1=new CurrentAccount(500);
        FixedTermAccount fixedTermAccount1=new FixedTermAccount(1000);

        currentAccount1.withdraw(10);

        System.out.printf("Current account balance: %.1f\n",currentAccount1.getBalance());
        System.out.printf("Fixed-term account balance: %.1f \n",fixedTermAccount1.getBalance());
    }
}
