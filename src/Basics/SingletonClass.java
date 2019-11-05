package Basics;
/* 3 ways we can destroy singleton  REFLECTION, SERIALIZATION, CLONING*/
/**
 * Enums are used to overcome REFLECTION issue
 *  -> As enums don’t have any constructor so it is not possible for Reflection to utilize it.
 *  JVM handles the creation and invocation of enum constructors internally
 */

/**
 *readResolve() method is used to overcome SERIALIZATION issue
 */

/**
 * override clone() method to overcome CLONING issue
 */
public class SingletonClass {

    //1.Private constructor to restrict instantiation  of the class from other classes
    private SingletonClass() {
    }

    //2.Private static variable of the same class that is the only instance of the class
    private static SingletonClass instance;

    //3.Public static method that returns the instance of the class,
    // this is the global access point for outer world to get the instance of the singleton class
    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                instance = new SingletonClass();
            }
        }
        return instance;
    }

}

//Another approach is using innerclass

