import FunctionalInterface.FunctionalInterfaceExample;
import FunctionalInterface.CallMeToPrint;
import LambdaExpression.ExampleWithLambda.MyFunctionalInterface;
import LambdaExpression.ExampleWithoutLambda.MyClass;
import LambdaExpression.OtherExamples.CheckForEmptyString.CheckEmptyString;
import LambdaExpression.OtherExamples.SumOfTwoInt.SumCalInterface;
import LambdaExpression.OtherExamples.SwitchCase.SwitchStringCase;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");

//// Enable it to check FunctionalInterface TagNo=001
//        FunctionalInterfaceExample fx = new FunctionalInterfaceExample();
//        fx.print("I am a functional interface");
//        CallMeToPrint.printStaticMethod(); // Static method will be called directly by class or interface, not by any object
//        fx.printDefaultMethod(); // calling the default method

////Enable it to check basic of FunctionalInterface TagNo=002
//        //Call ExampleWithoutLambda first
//        MyClass mc = new MyClass();
//        mc.print("Example without lambda");
//
//        //Call ExampleWithLambda
//        MyFunctionalInterface mf =(p)->System.out.println(p);
//        mf.print("Example with lambda");

////Enable it to check task of FunctionalInterface TagNo=003
//        //Write a Java program to implement a lambda expression to find the sum of two integers
//        SumCalInterface s=(x,y)->x+y;
//        int result1 = s.addTwo(10,20);
//        int result2 = s.addTwo(-10,20);
//        System.out.println("Adding 10 and 20: "+result1);
//        System.out.println("Adding -10 and 20: "+result2);

////Enable it to check task of FunctionalInterface TagNo=004
//        //Write a Java program to implement a lambda expression to check if a given string is empty.
//        CheckEmptyString ces=(p)->{
//            if(p==null){
//                return true;
//            }else{
//                return false;
//            }
//        };
//        //Alternate solution
//        CheckEmptyString ces2 = (p)->p.isEmpty();
//
//        boolean result =ces.checkString("dsfsf");
//        boolean result2 =ces2.checkString("null"); // never pass obj null, otherwise there will be null pointer exception
//        System.out.println("given not null string is "+result);
//        System.out.println("given null string is "+result2);

////Enable it to check task of FunctionalInterface TagNo=005
//        // Write a Java program to implement a lambda expression to convert a list of strings
//        // to uppercase and lowercase.
//        SwitchStringCase ssc= new SwitchStringCase();
//        List<String> li= ssc.toUpper();
//        System.out.println("lower to upper");
//        for(String s:li){
//            System.out.println(s);
//        }
//        List<String> li2=ssc.toLower();
//        System.out.println("upper to lower");
//        for (String s:li2){
//            System.out.println(s);
//        }

//Enable it to check task of FunctionalInterface TagNo=006
    }
}