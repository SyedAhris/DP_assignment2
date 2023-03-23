public class Barbeque extends ToppingDecorator{
    Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost() + 80;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Barbeque (80)";
    }
}
