import org.w3c.dom.Entity;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String input = in.nextLine();
        char[] inputChar = input.toCharArray();
        char firstNonRepeated = 0;
        HashMap<Character, Integer> hm = new LinkedHashMap<>(inputChar.length);

        for (int i = 0; i < inputChar.length; i++) {
            if (hm.containsKey(inputChar[i])) {
                Integer val = hm.get(inputChar[i]);
                val++;
                hm.put(inputChar[i], val);
            } else {
                hm.put(inputChar[i], 1);
            }
        }
        Map.Entry<Character, Integer> ent = hm.entrySet().stream().min((obj1, obj2) -> obj1.getValue() > obj2.getValue() ? 1 : -1).get();
        hm.entrySet().stream().min( (obj1,obj2)->obj1.getValue()>obj2.getValue()?1:-1).get();
        System.out.println("firstNonRepeated char" + ent.getValue() + ent.getKey());
    }
}
