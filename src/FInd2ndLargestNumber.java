import java.util.Scanner;

public class FInd2ndLargestNumber {

    public static void main(String s[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = in.nextInt();
        System.out.println("Enter the elements of the input array  with space :");
        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = in.nextInt();
        }
        find2NdLargest(input);

    }


    public static void find2NdLargest(int input[]) {
        int first, second;
        if (input.length < 2) {
            System.out.println("Invalid");
            return;
        }
        first = second = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {

            if (first <= input[i]) {
                second = first;
                first = input[i];
            } else {
                if (second <= input[i]) {
                    second = input[i];
                }
            }
        }
        System.out.println("The first largest number is :" + first);
        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second value ");
        } else {
            System.out.println("The Second largest number is :" + second);
        }
    }
}
