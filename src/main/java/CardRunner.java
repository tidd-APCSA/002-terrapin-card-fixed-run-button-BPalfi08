public class CardRunner {
  public static void main(String args[]){
    
    //Create both objects
    TerrapinCard cardBilly = new TerrapinCard(20.0);
    TerrapinCard cardBrian = new TerrapinCard(30.0);
    //First Transactions
    cardBilly.payGourmet();
    cardBrian.payEconomical();
    //Print 1st total
    System.out.println(cardBilly);
    System.out.println(cardBrian);
    //Second Transactions
    cardBilly.loadMoney(20);
    cardBrian.payGourmet();
    //Print 2nd total
    System.out.println(cardBilly);
    System.out.println(cardBrian);
    //Third Transactions
    cardBilly.payEconomical();
    cardBilly.payEconomical();
    cardBrian.loadMoney(50);
    //Print 3rd total
    System.out.println(cardBilly);
    System.out.println(cardBrian);
    //Testing getter method
    cardBilly.getBalance();
    cardBrian.getBalance();
  } 
}
