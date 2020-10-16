public class TerrapinCard {
  private double balance;

  public TerrapinCard(double balanceAtStart){
    //balance = startingBalance;
    balance = balanceAtStart;

    //Hey Brandon, I think I found your error. Your formal parameter name wasnt being used. I commented out your code and added the correct code. Run your tests now. Btw, for the NSA internship is there a website for the rec. letter?
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
