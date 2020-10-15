public class CardRunner {
    public static void main(String args[]){
        // ☕
        TerrapinCard card = new TerrapinCard(50);
        System.out.println(card);
        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);
    }
}
