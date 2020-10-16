public class TerrapinCard {
  private double balance;

  public TerrapinCard(double balanceAtStart){
    balance = startingBalance;
  }

  public String toString(){
    return "The card has " + balance + " dollars";
  }

  public void payEconomical(){
    if(balance>=2.5){
      balance-=2.5;
    }  
  }

  public void payGourmet(){
    if(balance>=4.0){
      balance-=4.0;
    }  
  } 

public void loadMoney(double amount){
  if(balance + amount > 150){
    balance+=0;
  }
  
  if(amount < 0){
    balance += 0;
  }
  
  if(balance + amount <= 150 && balance>0){
    balance+=amount;
  }
}

public double getBalance(){
  return this.balance;
}

}
