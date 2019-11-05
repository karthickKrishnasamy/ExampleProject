package java8;

import java.util.ArrayList;

public class StreamAddExample {
    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "karthick1",500));
        empList.add(new Employee(2, "karthick2",600));
        empList.add(new Employee(3, "karthick3",700));
        empList.add(new Employee(4, "karthick4",100));
        System.out.println("total salary :"+empList.stream().mapToLong(obj-> obj.getSalary()).sum());

        Employee result = empList.stream().max((obj1, obj2) -> obj1.getSalary() > obj2.getSalary() ? 1 : -1).get();
        System.out.println(result);

    }
}
