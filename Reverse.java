//https://www.hackerearth.com/practice/data-structures/arrays/1-d/tutorial/

//Input an array, then print in reverse

import java.util.*;


class Reverse {
    public static void main(String args[] ) throws Exception {
       Scanner kb = new Scanner(System.in);
       
       int size = kb.nextInt();
       int[] a = new int[size];
       for (int i = 0; i < size; i++) {
       		a[i] = kb.nextInt();
       }
       
      for (int i = size - 1; i >= 0; i--) {
      	System.out.println(a[i]);
      }
       
    }
}
