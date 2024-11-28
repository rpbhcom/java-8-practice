package FunctionalInterface;

@FunctionalInterface
public interface CallMeToPrint {
    void print(String msg); //only abstract method

    // It can have any no of static method
    static void printStaticMethod(){
        System.out.println("I am 1st static message inside a Functional Interface");
        printSecondStaticMethod();
    }
    // It can have any no of static method
    private static void printSecondStaticMethod(){
        System.out.println("I am 2nd static message inside a Functional Interface");
    }

    // It can declare any no of object class method
    int hashCode();
    String toString();
    boolean equals(Object object);

    //It can have any no of default method
    default void printDefaultMethod(){
        System.out.println("I am a default method");
    }
}
