import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by kkarthick87 on 07-10-2019.
 */
public class CalculateMaxAvgScore {

    public static void main(String s[]) {

        String[][] students = {
                {"Bob", "80"},
                {"Charles", "85"},
                {"Rob", "70"},
                {"Bob", "100"},
                {"Charles", "173"}
        };
        getMaxAvgOfObject(students);
    }

    private static void getMaxAvgOfObject(String[][] students) {
        HashMap<String, Double> studentHolder = new LinkedHashMap<>();
        for (int i = 0; i < students.length; i++) {
            if (studentHolder.containsKey(students[i][0])) {
                Double avg = (studentHolder.get(students[i][0]) + Double.valueOf(students[i][1])) / 2;
                studentHolder.put(students[i][0], avg);
            } else {
                studentHolder.put(students[i][0], Double.valueOf(students[i][1]));
            }
        }

        System.out.println(" Map with Avg value"+studentHolder);
        Map.Entry<String, Double> max = studentHolder.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get();
        System.out.println(max.getKey() + " " + max.getValue());
    }
}
