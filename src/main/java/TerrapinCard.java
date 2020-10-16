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
       if(amount < 0){
            this.balance = this.balance;
        }else if((this.balance + amount) > 150){
            this.balance = 150;
        }else{
            this.balance += amount;
        }
 
}

public double getBalance(){
  return this.balance;
}

}
