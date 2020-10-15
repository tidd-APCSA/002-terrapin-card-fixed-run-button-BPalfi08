public class TerrapinCard {
  private double balance;

  public TerrapinCard(double startingBalance){
    balance = startingBalance;
  }

  public String toString(){
    return "The Card has " + balance + " dollars";
  }

  public void payEconomical(){
    balance-=2.5;
  }

  public void payGourmet(){
    balance-=4.0;
  }





}
