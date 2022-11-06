package collection_review;

import java.util.*;

public class SetReview {
    public static void main(String[] args) {
      /*  List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,1,2,3,4,5));
        List<Integer> integers = removeDuplicate(list);

         System.out.println("integers = " + integers);
       */

        Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3,4,1,2,3,4,6,7,1,2,3,4,5));
        System.out.println(" original HashSet = " + set);

        Set<Integer> set2 = new LinkedHashSet<Integer>(Arrays.asList(1,2,3,4,1,2,3,4,6,7,1,2,3,4,5));
        System.out.println(" original LinkedHashSet = " + set2);

        Set<Integer> set3 = new TreeSet<Integer>(Arrays.asList(1,2,3,4,1,2,3,4,6,7,1,2,3,4,5));
        System.out.println(" original TreeSet = " + set3);
    }
    /*
    public static List<Integer> removeDuplicate(List<Integer> list){
        Set<Integer> set = new HashSet<Integer>(list);
        return new ArrayList<Integer>(set);
    }

     */
}
