
import java.util.*;


class Answers {


    public static void main(String args[] ) throws Exception {
       
       Scanner kb = new Scanner(System.in);
       
       int questions = kb.nextInt();
       int difficulty = kb.nextInt();
       int[] list = new int[questions];
       int count = 0;
       boolean skip = true;
       
       for (int i = 0; i < questions; i++) {
           list[i] = kb.nextInt();
           if (list[i] <= difficulty) {
               count++; 
           } else {
               if (skip == false) {
                   break;
               }
               skip = false;
           }
               
        }
    System.out.println(count);
    }
}
