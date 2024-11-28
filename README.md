JAVA 8 features to learn
------------------------
    1. Lambda Expression
    2. Method Reference
    3. Functional Interface
    4. Stream API
    5. Default Method
    6. Static Method in Interface
    7. Optional Class
    8. Collectors and StringJoiner Class
    9. ForEach Method
    10.Parallal Array Sorting

5.Default Method
    It is a method, with default identifier which will be inside of a interface, having method body. 
    Generally Interface does not allow any method to have body, it just allow to declare method.

    interface Example{
        void iAmAbstractMethod(); //only declaration
        default void iAmDefaultMethod(){
            System.out.println("default method"); //having method body
        }
    }
    
    practical example: Suppose doing any operation(inserting student info,teacher info) in a School,
                        Where school name will be always same, you may get school name from School interface
                        by using default method.

3.Functional Interface:
    An interface that contains only one abstract method and it can have any number of default 
    method or static method. It is also known as Single Abstract Method(SAM).
    It should be annotated with @FunctionalInterface

    Find the example in src/FunctionalInterface, 
    Open Main.java
    Find TagNo=001
    Comment out below code only for TagNo=001
    Comment others and run

1.Lambda Expression
    It is an expression that represent a Functional Interface. It is used in operation on stream collection.
    
    (arguments)->{expression}
    ()->{body}
    (p)->{body}
    (p1,p2)->{body}

    Find the example in src/LambdaExpression,
    Open Main.java
    Find TagNo=002
    Comment out below code only for TagNo=001
    Comment others and run
    
    Home work:
        //Write a Java program to implement a lambda expression to find the sum of two integers
        Find the example in src/OtherExample/SumOfTwoInt,
        Open Main.java
        Find TagNo=003
        Comment out below code only for TagNo=001
        Comment others and run

        //Write a Java program to implement a lambda expression to check if a given string is empty.
        Find the example in src/OtherExample/CheckForEmptyString,
        Open Main.java
        Find TagNo=004
        Comment out below code only for TagNo=001
        Comment others and run
        
        // Write a Java program to implement a lambda expression to convert a list of strings
        // to uppercase and lowercase.
        Find the example in src/OtherExample/SwitchCase,
        Open Main.java
        Find TagNo=005
        Comment out below code only for TagNo=001
        Comment others and run