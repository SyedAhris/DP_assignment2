public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PeppyPaneer();
        Pizza bbqTopping = new Barbeque(pizza);
        Pizza jalapenoTopping = new Jalapeno(bbqTopping);
        Pizza paneerTopping = new Paneer(jalapenoTopping);
        Pizza freshTomatoTopping = new FreshTomato(paneerTopping);
        System.out.println(freshTomatoTopping.getDescription());
        System.out.println("Cost = " + freshTomatoTopping.getCost() + " Rs");
        Pizza plainPizza = PizzaFactory.create();
        Pizza pizzaWithToppings = ToppingFactory.create(plainPizza);
        System.out.println(pizzaWithToppings.getDescription());
        System.out.println("Cost = " + pizzaWithToppings.getCost() + " Rs");
    }
}