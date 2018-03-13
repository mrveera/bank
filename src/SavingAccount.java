public class SavingAccount extends Account{
  private final String personName;
  private final int accountNumber;
  private float balance;
  SavingAccount(String personName,int accountNumber){
    this.personName = personName;
    this.accountNumber = accountNumber;
    this.balance=0;
  }
  public String getName() {
    return this.personName;
  }
  public float getBalance() {
    return this.balance;
  }
}
