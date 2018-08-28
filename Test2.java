package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class Test2 {
    static public Collection masCol(Object[] obj,Collection col){
        for (Object i:obj){
            col.add(i);
        }
        return  col;
    }
    public static void main(String[] args) {
        Object[] obj = new  String[3];
        Collection <String> col = new LinkedList<>();


        obj[0] = new String("text") ;
        obj[1] = new String("pen");
        obj[2] = new String("pencil");

        col = masCol(obj,col);

        for(Object object:col){
            System.out.println((String) object);
        }


    }
}
