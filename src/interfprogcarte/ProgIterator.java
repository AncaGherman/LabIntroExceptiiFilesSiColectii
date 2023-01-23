package interfprogcarte;
import java.util.ArrayList;
import java.util.Iterator;

public class ProgIterator {
        public static void main(String[] args) {

            // Make a collection
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");

            // Get the iterator
            Iterator<String> it = cars.iterator();

            // Print the first item
            System.out.println(it.next());
            listAllCars(cars);
            cars.remove(2);
            listAllCars(cars);
            cars.add("Mercedes");
            listAllCars(cars);

        }
        static void listAllCars(ArrayList cars) {
            Iterator it1 = cars.iterator();
            System.out.println();
            while(it1.hasNext()) {
                System.out.print(it1.next()+"  ");
            }
        }
}


