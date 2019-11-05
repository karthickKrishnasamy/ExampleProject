import java.util.Arrays;
import java.util.Comparator;

public class FormBiggerNumber {
    //11.	Arrange given numbers to form the biggest number
//1.	Example: {1, 34, 3, 98, 9, 76, 45, 4}
//2.	Output: 998764543431
    public static void main(String[] args) {
        int[] ss = {1, 34, 3, 98, 9, 76, 45, 4};
        String[] strArray = new String[ss.length];
        for (int i = 0; i < ss.length; i++) {
            strArray[i] = String.valueOf(ss[i]);
        }
        formBigNumber(strArray);

    }

    private static void formBigNumber(String[] input) {
        //(o1, o2) -> (o2 + o1).compareTo(o1 +o2)
        Arrays.sort(input,(o1,o2)->(o2+o1).compareTo(o1+o2))/*Arrays.sort(input, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 +o2);
            }
        });*/;

        StringBuilder sb = new StringBuilder();
        for (String ss : input) {
            sb.append(ss);
        }
        System.out.println(sb.toString());
    }
}
