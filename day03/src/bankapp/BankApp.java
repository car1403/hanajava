package bankapp;

import bank.Account;

public class BankApp {
    public static void main(String[] args) {

//        System.out.println(Account.count);
        Account acc1 = new Account("","James",1000L,2.3);
        Account acc2 = new Account("","James",1000L,2.3);
        Account acc3 = new Account("","James",1000L,2.3);
        Account acc4 = new Account("","James",1000L,2.3);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(acc4);


//        System.out.println(acc1);
//        acc1.deposit(-1000L);
//        System.out.println(acc1);
//       // acc1.withdraw(10000000L);
//        System.out.println(acc1.getCalInterest());
//        System.out.println(acc1.getCalInterest(12));
//        System.out.println(Account.count);
//
//        System.out.println(Math.PI);
    }
}
