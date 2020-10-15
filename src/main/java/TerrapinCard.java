public class TerrapinCard {
  private double balance;

  public TerrapinCard(double startingBalance){
    balance = startingBalance;
  }

  public String toString(){
    return "The Card has " + balance + " dollars";
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
    balance+=amount;
    if(balance>150.0){
      balance = 150.0;
    }
}



}
