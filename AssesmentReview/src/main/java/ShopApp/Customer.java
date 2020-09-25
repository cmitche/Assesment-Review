package ShopApp;

import java.util.Arrays;

public class Customer {
    //Instance Variables, States, Fields
    private String name;
    private Clothing[] clothingItems;
    private char size;


    //Constructor creates a customer object
    public Customer(String name, Clothing[] clothingItems, char size) {
        this.name = name;
        this.clothingItems = clothingItems;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothing[] getClothingItems() {
        return clothingItems;
    }

    public void setClothingItems(Clothing[] clothingItems) {
        this.clothingItems = clothingItems;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", clothingItems=" + Arrays.toString(clothingItems) +
                ", size=" + size +
                '}';
    }
}
