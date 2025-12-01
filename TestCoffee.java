public class TestCoffee {

    public static void main (String[] args) {
        
        Coffee coffee = new BlackCoffee();
        coffee = new Milk(coffee);
        coffee = new CaramelSyrup(coffee);

        System.out.print("Order: " + coffee.getDescription());
        System.out.println("\nTotal Cost: ₱" + coffee.getCost());
    }
}