import java.util.concurrent.ScheduledExecutorService;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bun sweetBrioche = new Bun("Sweet Brioche",13);
        Bun normal = new Bun ("Normal Bun",12);
        Bun saltyPretzel = new Bun ("Salty Pretzel",13);


        Burger burger = new Burger("Salty",saltyPretzel,900);
        burger.addIngridient("Beacon",3);
        burger.buy();

        DeluxeBurger deluxe = new DeluxeBurger("Mover",normal,210);
        deluxe.addIngridient("Mozarella",2);
        deluxe.buy();


        HealthyBurger healthy = new HealthyBurger("Banana", 100);
        healthy.addIngridient("Mayo",3);
        healthy.addIngridient("Ketchup",2);
        healthy.addIngridient("Pepper",2);
        healthy.addIngridient("Beacon",3);
        healthy.addIngridient("Spinach",2);
        healthy.addIngridient("Brie",3);
        healthy.buy();

    }
}
