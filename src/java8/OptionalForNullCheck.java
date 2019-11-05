package java8;

import java.util.Optional;

public class OptionalForNullCheck {
    public static void main(String[] args) {
        Employee e = new Employee(1, "emp1", 100);
        System.out.println(process(null));
    }

    public static Optional<Long> process(Employee e) {
      return  Optional.of(e.getSalary());
    }

}
