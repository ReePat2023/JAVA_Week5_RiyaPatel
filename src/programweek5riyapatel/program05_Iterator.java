package programweek5riyapatel;

import java.util.ArrayList;
import java.util.ListIterator;

public class program05_Iterator {
    public static void main(String[] args) {

        ArrayList<String> CarList = new ArrayList();
        CarList.add("Audi");
        CarList.add("BMW");
        CarList.add("Mercedes");
        CarList.add("Tesla");
        CarList.add("Alpha Romeo");
        CarList.add("Range Rover");
        CarList.add("Jaguar");
        CarList.add("Ferrari");

        ListIterator<String> iterate = CarList.listIterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next());
        }

    }
}
