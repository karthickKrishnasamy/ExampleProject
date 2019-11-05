import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by kkarthick87 on 08-10-2019.
 */
public class FindPositionsOfOccurrence {
    public static void main(String s[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the input array :");
        int size = input.nextInt();
        System.out.println("Enter the elements of the input array  with space :");
        ArrayList<Integer> elements = new ArrayList();

        for (int i = 0; i < size; i++) {
            elements.add(input.nextInt());
        }

        System.out.println("Input :"+elements.toString());

        System.out.println("Enter the Finding element among the input elements :");
        int finder = input.nextInt();

        LinkedList occurrence = getFirstOccurancePosition(elements, finder);
        System.out.println(" First Occurrence :" + occurrence.getFirst());

        System.out.println(" Last Occurrence :" + occurrence.getLast());
    }

    private static LinkedList getFirstOccurancePosition(ArrayList<Integer> elements, int finder) {

        LinkedList occurrenceList = new LinkedList();
        for (int i = 0; i < elements.size(); i++) {

            if (finder == elements.get(i)) {
                occurrenceList.add(i);
            }
        }
        return occurrenceList;
    }
}
