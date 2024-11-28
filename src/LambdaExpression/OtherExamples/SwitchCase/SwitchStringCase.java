package LambdaExpression.OtherExamples.SwitchCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwitchStringCase {
    List<String> myArrLst = Arrays.asList("ABC","DEF","GHI");
    List<String> myList= new ArrayList<>();
    public SwitchStringCase(){
        System.out.println("Actual List");
        myList.add("abc");
        myList.add("def");
        myList.add("ghi");

        for (String s:myList){
            System.out.println(s);
        }
    }

    public List<String> toUpper(){
        myList.replaceAll(p->p.toUpperCase());
     return myList;
    }

    public List<String> toLower(){
        myArrLst.replaceAll(p->p.toLowerCase());
        return myArrLst;
    }
}
