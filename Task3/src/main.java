public class main {

    public static void main(String[] args) {

        SavingAccount account1 = new SavingAccount("Jonh", "Doe", 2000);
        SavingAccount account2 = new SavingAccount("Sarah", "Connor", 3000);

        SavingAccount.calculateMonthlyInterest(account1);
        SavingAccount.calculateMonthlyInterest(account2);

        SavingAccount.setAnnualInterestRate(0.05);

        System.out.println("The amount of " + account1.getFirstName() + " " + account1.getLastName() +" is: " + account1.getSavingsBalance());
        System.out.println("The amount of " + account2.getFirstName() + " " + account2.getLastName() +" is: " + account2.getSavingsBalance());

        SavingAccount.transferFunds(account1, account2, 700);

        System.out.println("The amount of " + account1.getFirstName() + " " + account1.getLastName() +" is: " + account1.getSavingsBalance());
        System.out.println("The amount of " + account2.getFirstName() + " " + account2.getLastName() +" is: " + account2.getSavingsBalance());

        Bank.accounts.add(account1);
        Bank.accounts.add(account2);

        Bank.calculateGlobalMonthlyInterest();
        
    }


}
