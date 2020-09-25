package ShopApp;

public class ShopApp {
    private final double tax = .1;
    public double calcTotal(Clothing[] clothing){
        double totalPrice = 0;
        for(int index = 0; index < clothing.length; index++){
            totalPrice += clothing[index].getPrice();
        }
        return totalPrice = totalPrice + (totalPrice * tax);
    }

    public char measure(Customer customer){
        return customer.getSize();
    }

    public double employeePriceAfterDiscount(Employee employee){
        double totalPrice = 0;
        Clothing[] employeeClothing = employee.getClothingItems();
        for(int index = 0; index < employeeClothing.length; index++){
            totalPrice += employeeClothing[index].getPrice();
        }
        totalPrice = totalPrice - (totalPrice * employee.getDiscount());
        return totalPrice = totalPrice + (totalPrice * tax);
    }
}
