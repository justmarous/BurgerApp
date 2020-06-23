public class DeluxeBurger extends Burger {

    public DeluxeBurger(String name, Bun bunType, int meatSize) {
        super("Deluxe "+name, bunType, meatSize);
        super.addIngridient("Chips",5.0);
        super.addIngridient("Drink",3.0);
    }

    @Override
    void addIngridient(String ingridient, double addPrice) {
        System.out.println();
        System.out.println("Sorry, no additional ingridients to this burger.");
    }
}
