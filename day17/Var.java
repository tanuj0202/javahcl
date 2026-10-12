package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Var {
    public static void main(String[] args) {
        var name = "tanuj"; var age = 21; var salary = 800000;
        var names = new ArrayList<>(List.of("Kunal","Siddharth","Mehul"));

        var marks = new HashMap<Integer,String>();
        var list = new ArrayList<String>();
        list.add(name);
        list.add("methi");

        var numbers = new int[] {10,12,45,17,7};
        // var numbers2 = new int[5];

        System.out.println(name);
        System.out.println(names);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(list);
        System.out.println(numbers);
    }
}