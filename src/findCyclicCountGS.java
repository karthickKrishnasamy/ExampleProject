import java.util.HashMap;

/**
 * Given an array of integers where each element points to the
 * index of the next element how would you detect if there is a cycle in this array
 */
public class findCyclicCountGS {
    private static HashMap<Integer, Integer> visited = new HashMap<>();
    static int count = 0;

    public static void main(String s[]) {
        int[] arr = {1, 3, 0, 1};
        int index = 0;

        //while (!visited.containsKey(index)) {
        for(int i=0;i<6;i++) {
            index = getNextIndex(arr, index);
        }

        System.out.println(visited);
    }

    public static int getNextIndex(int[] arr, int index) {
        int counter=1;
        if(visited.containsKey(index)){
            visited.put(index, counter);
        }else{
            counter++;
            visited.put(index, counter);
        }
        System.out.println(index);
        return arr[index];
    }
}
