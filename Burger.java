public class Burger {

    private Bun bunType;
    private int meatSize;
    private double price;
    private int noIngridients;
    private String additions = "";
    private String name;

    public Burger(String name, Bun bunType, int meatSize) {
        this.name = name;
        this.bunType = bunType;
        this.price = 13.0;
        this.noIngridients = 0;

        this.meatSize = meatSize;
        if(meatSize<50) this.meatSize = 50;
        if(meatSize>400)this.meatSize = 400;
        this.price += ((double)this.meatSize / 25);

        System.out.println("*** *** *** *** *** *** *** ***\n\nOkay, so you want burger "+name+ " on "+bunType.getBunType()+ " with "+this.meatSize+"g of meat.");
        System.out.println();
    }

    public Bun getBunType() {
        return bunType;
    }

    public int getMeatSize() {
        return meatSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    void addIngridient(String ingridient, double addPrice)
    {
        if(noIngridients<4)
        {
            if(noIngridients>0)this.additions += ",";
            this.additions +=" "+ ingridient.toLowerCase() ;
            this.price += addPrice;
            System.out.println(ingridient + " added to burger");
            this.noIngridients++;
        }
        else {
            System.out.println("\nSorry, you reached maximum number of additions, your burger will be without " + ingridient.toLowerCase()+".");
        }

    }

    public String getAdditions() {
        return additions;
    }

    void buy()
    {
        System.out.println();
        System.out.println("Here you go, your burger: "+name+".");
        System.out.println("It has "+meatSize+"g of meat, it has "+bunType.getBunType()+" bun.");
        if(noIngridients>0) System.out.println("Also, it contains"+additions+" - sounds nice!");
        System.out.println("It will be "+price+" złotych, bon appetit!");
        System.out.println();
    }
}
