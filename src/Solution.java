// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static List<Integer> cellCompete(int[] states, int days)
    {
        // WRITE YOUR CODE HERE
        // List<Integer> output= new ArrayList();
        int[] output = new int[8];
        while(days>0){
            int start=0;
            int end=0;
            for(int i=1;i<states.length;i++){
                if(i==1){
                    if(start==states[i]){
                        output[i]=0;
                    }else{
                        output[i]=1;
                    }
                }else if(i==states.length){
                    if(end==states[i-1]){
                        output[i]=0;
                    }else{
                        output[i]=1;
                    }
                }else{
                    if(states[i-2]==states[i]){
                        output[i]=0;
                    }else{
                        output[i]=1;
                    }
                }
            }
            states=output;
            for(int s:output){
                System.out.print(s);

            }
            System.out.println("_____________________");

            days--;
            Double d= Math.sqrt(1);
        }
        Integer[] newArray = new Integer[output.length];
        int i = 0;
        for (int value : output) {
            newArray[i++] = Integer.valueOf(value);
        }
        return Arrays.asList(newArray);
    }

    static int[] inpoot() { // this method has to return int[]
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[8];

        System.out.println("Please enter 8 numbers ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers; // return array here
    }
    public static void main(String s[]){
        int[] numbers = inpoot();
        List<Integer> o= cellCompete(numbers,2);
        for(Integer ee :o){
            System.out.print(ee);
        }
    }
    // METHOD SIGNATURE ENDS
}  