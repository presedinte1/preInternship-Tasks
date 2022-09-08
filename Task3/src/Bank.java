import java.util.ArrayList;
import java.util.List;

public class Bank {
    static List <SavingAccount> accounts = new ArrayList<>();

    public static double totalAmountSavings;
    public static double totalAmountMonthlyInterest;
    public static double totalMonthlySavAndInt;

    /*accounts.add(account1);
        Bank.accounts.add(account2);*/

    public static void calculateGlobalMonthlyInterest(){
        totalAmountSavings=0;
        totalAmountMonthlyInterest=0;
        totalMonthlySavAndInt=0;

        for (int i = 0; i < accounts.size() ; i++) {
            totalAmountSavings += accounts.get(i).getSavingsBalance();
        }
        totalAmountMonthlyInterest = totalAmountSavings * SavingAccount.annualInterestRate / 12;
        totalMonthlySavAndInt = totalAmountSavings + totalAmountMonthlyInterest;

        System.out.println();
        System.out.println("totalAmountSavings:" + totalAmountSavings);
        System.out.println("totalAmountMonthlyInterest:" + totalAmountMonthlyInterest);
        System.out.println("totalMonthlySavAndInt:" + totalMonthlySavAndInt);
        System.out.println();
    }

}
