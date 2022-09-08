public class SavingAccount {

    private String firstName;
    private String lastName;
    private double savingsBalance;

    public static double annualInterestRate=0.04;

    public SavingAccount(String firstName, String lastName, double savingsBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.savingsBalance = savingsBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void setAnnualInterestRate (double newAnnualInterestRate){
        annualInterestRate=newAnnualInterestRate;
    }


    public static void calculateMonthlyInterest(SavingAccount account) {
        double monthlyInterest = account.getSavingsBalance() * SavingAccount.annualInterestRate / 12;
        double tempSavingsBalance = account.getSavingsBalance();
        account.setSavingsBalance(tempSavingsBalance + monthlyInterest);
        System.out.println("The amount of " + account.getFirstName() + " " + account.getLastName() +" with Monthly Interest is:" + account.getSavingsBalance());
    }

    public static void transferFunds(SavingAccount sender, SavingAccount recipient, double amount){
        sender.setSavingsBalance(sender.getSavingsBalance()-amount);
        recipient.setSavingsBalance(recipient.getSavingsBalance()+amount);
        System.out.println("Making a transfer in amount of: " + amount);
    }

}
