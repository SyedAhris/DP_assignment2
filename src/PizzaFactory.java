import java.util.Scanner;

public class PizzaFactory {
    //create a method that runs infinitely and asks user options to create pizza and add toppings
    public static Pizza create(){
        System.out.println("Welcome to Pizza Factory");
        System.out.println("Choose your pizza");
        System.out.println("1. Peppy Paneer");
        System.out.println("2. Farm House");
        System.out.println("3. Margherita");
        System.out.println("4. Chicken Fiesta");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);
        int pizzaChoice = sc.nextInt();
        Pizza pizza = null;
        switch (pizzaChoice){
            case 1:
                pizza = new PeppyPaneer();
                break;
            case 2:
                pizza = new FarmHouse();
                break;
            case 3:
                pizza = new Margheritta();
                break;
            case 4:
                pizza = new ChickenFiesta();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                create();
        }
        return pizza;
    }
}
