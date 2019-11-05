package Basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

    public static void main(String s[]) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonClass obj = SingletonClass.getInstance();
        System.out.println("obj :"+obj);
        SingletonClass obj1 = SingletonClass.getInstance();
        System.out.println("obj1 :"+obj1);
        try {
            System.out.println("Reflection Instance _____");
            Class reflectionObj = Class.forName("Basics.SingletonClass");
            Constructor[] constructors = reflectionObj.getDeclaredConstructors();
            for (Constructor c : constructors) {
                c.setAccessible(true);
                SingletonClass obj3 = (SingletonClass)c.newInstance();
                System.out.println("obj3 :"+obj3);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
