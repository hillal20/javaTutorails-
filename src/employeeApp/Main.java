package employeeApp;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        HealthPlan h1 = new HealthPlan("my health plan 1 ");
        HealthPlan h2 = new HealthPlan("my health plan 2 ");
        HealthPlan h3 = new HealthPlan("my health plan 3 ");

        Company c1 = new Company("company 1 ", 100);
        Company c2 = new Company("company 2 ", 200);

        Employee emp1 = new Employee("steve", "meatchle", 45000, true, c1.id, h1.getId());
        Employee emp2 = new Employee("bill", "hill", 8000, true, c2.id, h2.getId());
        Employee emp3 = new Employee("jhon", "meat", 44000, true, c1.id, h2.getId());
        Employee emp4 = new Employee("ali", "rose", 89000, true, c2.id, h2.getId());

        // System.out.println("**** here is ****\n");
        // System.out.println(emp1);
        System.out.println("\n **** Arrays is here  ****");
        Dogs[] dogsArr = new Dogs[5];
        dogsArr[0] = new Dogs("sprinter", 50, false);
        dogsArr[4] = new Dogs("cong", 40, true);
        dogsArr[2] = new Dogs("slog", 23, true);
        dogsArr[1] = new Dogs("blog", 56, false);
        dogsArr[3] = new Dogs("font", 40, true);

        for (int i = 0; i < dogsArr.length; i++) {
            System.out.println(dogsArr[i]);
        }
        System.out.println(dogsArr[1].getApt());
        System.out.println(dogsArr.toString());
        System.out.println(dogsArr);
        System.out.println(Arrays.toString(dogsArr));

        ////////////////////////////////////////////////// C
        /////////////////////////////////////////////////

        System.out.println("\n *** ArrayList is here  ****");

        ArrayList<Dogs> dogsArrayList = new ArrayList<Dogs>();
        dogsArrayList.addAll(Arrays.asList(dogsArr));

        // we dont care about size in arrayLists
        dogsArrayList.add(2, new Dogs("Bilo", 30, true));

        // for (Dogs dog : dogsArrayList) {
        // System.out.println(dog);
        // }

        dogsArrayList.set(2, new Dogs("hhhh", 30, true));
        dogsArrayList.forEach(dog -> System.out.print(dog + "  foreach,"));

        System.out.println();

        System.out.println("\n size " + dogsArrayList.size());

        dogsArrayList.remove(4);
        System.out.println("\n dogList  " + dogsArrayList);
        System.out.println("\n size " + dogsArrayList.size());

        ///////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////

        System.out.println("\n **** hashMaps is here  ****");

        HashMap<Integer, Dogs> dogsHashMap = new HashMap<Integer, Dogs>();
        int hashCount = 0;
        for (Dogs dog : dogsArrayList) {
            dogsHashMap.put(hashCount, dog);
            hashCount++;
        }

        dogsArrayList.clear();

        System.out.println("\n hashMap key 3  ====> " + dogsHashMap.get(3));
        System.out.println("\n size  ====> " + dogsHashMap.size());
        dogsHashMap.remove(3);
        System.out.println("\n hashMap ====> " + dogsHashMap);
        System.out.println("\n hashMap keySet  ====> " + dogsHashMap.keySet());
        System.out.println("\n hashMap entrySet ====> " + dogsHashMap.entrySet());

        ///////////////////////////////////////////////
        /////////////////////////////////////////////////

        System.out.println("\n **** hashMaps sorting after transforming  into a array list   ****");

        ArrayList<HashMap.Entry<Integer, Dogs>> sortedDogsHashmaps = new ArrayList<HashMap.Entry<Integer, Dogs>>();
        sortedDogsHashmaps.addAll(dogsHashMap.entrySet());

        Collections.sort(sortedDogsHashmaps, new Comparator<HashMap.Entry<Integer, Dogs>>() {
            public int compare(HashMap.Entry<Integer, Dogs> obj1, HashMap.Entry<Integer, Dogs> obj2) {
                // return
                // obj1.getValue().getBreed().compareToIgnoreCase(obj2.getValue().getBreed());
                return obj2.getValue().getAveWeight() - obj1.getValue().getAveWeight();
            }
        });
        System.out.println("\n hashMap  sorted keySet  ====> " + sortedDogsHashmaps);

    }

}