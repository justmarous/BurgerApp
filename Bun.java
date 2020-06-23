public class Bun {

    private String bunType;
    private double price;

    public Bun(String bunType, double price) {
            this.bunType = bunType;
            this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public String getBunType() {
        return bunType;
    }
}
