package collection_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListReview {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,1,2,3,4,5));
        System.out.println(" original list = " + list);
        System.out.println("list.get(0) = " + list.get(0));
        list.remove(0);
        System.out.println(" original list = " + list);
        System.out.println("===============remove with for==================");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.remove(i);
            }
        }
        System.out.println("list after remove with for loop= " + list);

        System.out.println("===============remove with iterator==================");
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            if(iterator.next() < 4){
                iterator.remove();
            }
        }
        System.out.println("list2 after remove with for iterator= " + list);

        System.out.println("===============remove with removeIf==================");
        List<Integer> list2  = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,1,2,3,4,5));
        System.out.println(" original list2 = " + list2);
        list2.removeIf( p -> p<4 );


    }
}
