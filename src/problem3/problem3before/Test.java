package problem3.problem3before;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args){
        Account account1=new Account(500);
        FixedTermAccount fixedTermAccount1=new FixedTermAccount(1000);
        List<Account> list1= Arrays.asList(account1,fixedTermAccount1);
        //Bank.chargeMonthlyFee(account1);
    }
}
