package Lesoon15.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(5);

        int temp;
        temp = arrayList.get(0) * arrayList.get(4);
        arrayList.add(1,temp);
        System.out.println(temp );

        Collections.sort(arrayList);
        System.out.println(arrayList.get(1) + " " +  arrayList.size() +" " + arrayList);
    }
}
