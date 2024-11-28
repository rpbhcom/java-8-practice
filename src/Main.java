import FunctionalInterface.FunctionalInterfaceExample;
import FunctionalInterface.CallMeToPrint;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");

// Enable it to check FunctionalInterface TagNo=001
        FunctionalInterfaceExample fx = new FunctionalInterfaceExample();
        fx.print("I am a functional interface");
        CallMeToPrint.printStaticMethod(); // Static method will be called directly by class or interface, not by any object
        fx.printDefaultMethod(); // calling the default method

//Enable it to check FunctionalInterface TagNo=002
    }
}