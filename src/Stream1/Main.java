package src.Stream1;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();

        for(int list : intList) {
            if (list > 0) {
                if(list % 2 == 0) {
                    newList.add(list);
                }
            }
        }
        Collections.sort(newList);

        for(int list2 : newList) {
            System.out.println(list2);
        }


    }
}
