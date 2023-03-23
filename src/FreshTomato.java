public class FreshTomato extends ToppingDecorator{
    Pizza pizza;
    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato (20)";
    }
}
