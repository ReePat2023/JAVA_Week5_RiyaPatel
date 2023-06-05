package programweek5riyapatel;

import java.util.ArrayList;

public class Program07_ArrayEmptyOrNot {
    public void isEmptyOrNot() {
        ArrayList<String> CarList = new ArrayList<>();
        CarList.add("Ferrari");
        CarList.add("Bugatti");
        CarList.add("Mercedes Benz");
        CarList.add("Pagani Huayra");
        CarList.add("Lamborghini");
        CarList.add("Porsche");
        CarList.add("Range Rover");
        CarList.add("Audi");
        System.out.println("Given Array List : " + CarList);
        if (CarList.isEmpty()) {
            System.out.println(" !! Given Array List is Empty !! ");
        } else {
            System.out.println("!! Given Array List is Not Empty !!");
        }
    }

    public static void main(String[] args) {
        Program07_ArrayEmptyOrNot obj = new Program07_ArrayEmptyOrNot();
        obj.isEmptyOrNot();
    }
}
