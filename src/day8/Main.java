package day8;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // tao map rong
        Map<Person, List<Car>> listMap = new HashMap<>();

        // tao2 nguoi
        Person p1 = new Person(1,"A","Male");
        Person p2 = new Person(2,"B","Female");

        //Tao 3 xe
        Car c1 = new Car(1,"red", "Honda City");
        Car c2 = new Car(2,"White", "CRV");
        Car c3 = new Car(3,"Blue", "Camry");

        //p1 so huu c1
        listMap.put(p1, Arrays.asList(c1));
        //p2 so huu c2
        listMap.put(p2, Arrays.asList(c2));

        //in thu ra map
        System.out.println(listMap);

        //p1mua them c3?
        //lay ds xe. them vao list
        List<Car> p1List = new ArrayList<>(listMap.get(p1));
        listMap.put(p1, p1List);
        System.out.println(listMap);


    }
}
