package ShopApp;

public class CheckoutCounter {
    public static void main(String[] args) {
        Clothing heels = new Clothing("Black Strappy Heels", 250.00, 'M');
        Clothing dress = new Clothing("Stapless Mid Dress", 125.00, 'S');
        Clothing skirt = new Clothing("Gucci Jean Skirt", 300.00, 'L');
        Clothing[] shoppingBag = {heels, dress, skirt};
        Customer customer1 = new Customer("Megan The Stallion", shoppingBag, 'L');


        Clothing jeans = new Clothing("Skinny Ass Jeans", 20.00, 'M');
        Clothing shoes = new Clothing("Retro Air Jordan 1", 60.00, 'S');
        Clothing tShirt = new Clothing("Blue Graphic T-Shirt", 20.00, 'M');
        Clothing[] shoppingCart = {jeans, shoes, tShirt};
        Employee employee1 = new Employee("Tory Lanez", shoppingCart, 'S', .1);

        ShopApp shopApp = new ShopApp();

        //Begin checkout of Customer
        System.out.println("Welcome to the Piggly Wiggly " + customer1.getName() + "! " + "#RealHotGirlShit!");
        System.out.println("We measured you, and you are a size: " + customer1.getSize());
        for (int index = 0; index < shoppingBag.length; index++) {
            if (shoppingBag[index].isAFit(customer1)) {
                System.out.println("The item " + shoppingBag[index].getDescription() + " fits!");
            } else {
                System.out.println("The item " + shoppingBag[index].getDescription() + " does not fit!");
            }
        }
        System.out.println("Hello " + customer1.getName() + "!" + " Your total for today is: " + shopApp.calcTotal(shoppingBag) + ".");


        //Begin checkout of Employee
        System.out.println("\n");
        System.out.println("Welcome to the Big Baller Brand " + employee1.getName() + "! " + "Did you use a Glock17 or  Glock19?");
        System.out.println("We measured you, and you are a size: " + employee1.getSize());
        for (int index = 0; index < shoppingCart.length; index++) {
            if (shoppingCart[index].isAFit(employee1)) {
                System.out.println("The item " + shoppingCart[index].getDescription() + " fits!");
            } else {
                System.out.println("The item " + shoppingCart[index].getDescription() + " does not fit!");
            }
        }
        System.out.println("Hello " + employee1.getName() + "!" + " Your total for today is: " + shopApp.employeePriceAfterDiscount(employee1) + ".");
    }
}
