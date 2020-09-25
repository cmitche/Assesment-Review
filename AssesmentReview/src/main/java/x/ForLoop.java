package x;

public class ForLoop {
    public static void main(String[] args) {
        for(int index = 1; index <= 5; index++){
            System.out.println("I love dogs!");
        }

        //Create a loop that prints out even numbers from 0 to 20;
        for(int index = 0; index <= 20; index++){
            if(index % 2 == 0){
                System.out.println(index);
            }else{}
        }

        //Create a loop that prints out ODD numbers from 100 to 50;
        for(int index = 100; index >= 50; index--){
            if(index % 2 != 0){
                System.out.println(index);
            }else{}
        }
    }
}
