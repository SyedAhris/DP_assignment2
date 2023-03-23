import java.util.Scanner;

public class ToppingFactory {
    public static Pizza create(Pizza pizza){
        while (true) {
            System.out.println("Choose your toppings");
            System.out.println("1. Barbeque");
            System.out.println("2. Jalapeno");
            System.out.println("3. Paneer");
            System.out.println("4. Fresh Tomato");
            System.out.println("5. Exit");
            Scanner sc = new Scanner(System.in);
            int toppingChoice = sc.nextInt();
            switch (toppingChoice) {
                case 1:
                    pizza = new Barbeque(pizza);
                    break;
                case 2:
                    pizza = new Jalapeno(pizza);
                    break;
                case 3:
                    pizza = new Paneer(pizza);
                    break;
                case 4:
                    pizza = new FreshTomato(pizza);
                    break;
                case 5:
                    return pizza;
                default:
                    System.out.println("Invalid choice");
                    create(pizza);
            }
        }
    }
}
