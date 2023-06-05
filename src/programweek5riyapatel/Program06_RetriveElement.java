package programweek5riyapatel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Program06_RetriveElement {
    public static void main(String[] args) {

        ArrayList<String> CarList = new ArrayList();
        CarList.add("Ferrari");
        CarList.add("Bugatti");
        CarList.add("Mercedes Benz");
        CarList.add("Pagani Hayura");
        CarList.add("Lamborghini");
        CarList.add("Range Rover");
        CarList.add("Jaguar");
        CarList.add("Audi");
        System.out.println(CarList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number to choose from the index : ");
        int index =scanner.nextInt();
        if (index< CarList.size()){
            System.out.println(CarList.get(index));
        } else {
            System.out.println(" ! Invalid Input by the User !");
        }
        scanner.close();
    }

}
