public class Paneer extends ToppingDecorator{
    Pizza pizza;
    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost() + 60;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Paneer (60)";
    }
}
