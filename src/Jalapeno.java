public class Jalapeno extends ToppingDecorator{
    Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Jalapeno (20)";
    }
}
