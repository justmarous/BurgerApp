public class HealthyBurger extends Burger {

    private int noIngridients;
    private String additions = "";
    private double price;

    public HealthyBurger(String name, int meatSize) {
        super("Healthy "+name, new Bun("Brown Rye", 12), meatSize);
        super.setPrice(super.getPrice()+2);
        this.noIngridients = noIngridients;
        this.additions = additions;
    }

    @Override
    void addIngridient(String ingridient, double addPrice) {

        if(this.noIngridients<6)
        {
            if(noIngridients>0)this.additions += ",";
            this.additions +=" "+ ingridient.toLowerCase() ;
            super.setPrice(getPrice()+addPrice);
            System.out.println(ingridient + " added to burger");
            this.noIngridients++;
        }
        else {
            System.out.println("\nSorry, you reached maximum number of additions, your burger will be without " + ingridient.toLowerCase()+".");
        }
    }
}
