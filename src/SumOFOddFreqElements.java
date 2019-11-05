
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by kkarthick87 on 28-10-2018.
 */
public class SumOFOddFreqElements {

    public static void main(String ss[]) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[8];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("");
        System.out.println("unique candy"+solution(numbers));
    }
       // Arrays.sort();
       public static int solution(int[] T) {
           // write your code in Java SE 8
           ArrayList<Integer> marry = new ArrayList<Integer>();
           ArrayList<Integer> bro = new ArrayList<Integer>();
           for(int i=0;i<T.length;i++){
               if(!marry.contains(T[i])){
                   marry.add(T[i]);
               }else{
                   bro.add(T[i]);
               }
           }
           if(marry.size()!=bro.size()){
               int length= T.length%2;
               for(int i=bro.size();i<length;i--){
                   marry.add(bro.get(i));
               }
           }
           System.out.println("Bro -");
           for(Integer s:bro){
               System.out.print(s+",");
           }
           System.out.println("------------- -");
           System.out.println("Marry ----");
           for(Integer s:marry){
               System.out.print(s+",");
           }
           return marry.size();
       }
}
