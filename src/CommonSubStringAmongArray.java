import java.util.Scanner;

public class CommonSubStringAmongArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = in.nextInt();
        System.out.println("Enter the elements of the input array  with space :");
        String input[] = new String[size];
        for (int i = 0; i < size; i++) {
            input[i] = in.next();
        }
        System.out.println(findCommonStringInArray(input));

    }

    public static String findCommonStringInArray(String[] inputArr) {
        int arrLength = inputArr.length;
        String first = inputArr[0];
        int firstStrLen = first.length();
        String res = "";
        for (int i = 0; i < firstStrLen; i++) {
            for (int j = i + 1; j <= firstStrLen; j++) {
                String stem = first.substring(i, j);
                int k = 1;
                for (k = 1; k < arrLength; k++) {
                    if (!inputArr[k].contains(stem)) {
                        break;
                    }
                }
                if (k == arrLength && res.length() < stem.length())
                    res = stem;
            }
        }
        return res;
    }
}
