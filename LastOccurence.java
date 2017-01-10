// https://www.hackerearth.com/practice/algorithms/searching/linear-search/tutorial/

import java.util.*;


class LastOccurence {
    public static void main(String args[]) throws Exception {
       
       Scanner kb = new Scanner(System.in);
       
       int size = kb.nextInt();
       int element = kb.nextInt();
       
       int[] a = new int[size];
       
       int save = 0;
       
       for (int i = 1; i <= size; i++) {
    		 a[i-1] = kb.nextInt();
    		 if (a[i-1] == element) {
    		 	save = i;
    		 }
       }
       
       System.out.println(save);
       
    }
}
