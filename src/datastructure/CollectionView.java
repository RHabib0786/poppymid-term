package datastructure;



import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class CollectionView {

public static <set> void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        Set<Map.Entry<Integer,String>>entrySet=map.entrySet();
        Iterator<Map.Entry<Integer,String>>it= entrySet.iterator();
        for(Map.Entry<Integer,String>input:entrySet){
                Integer i=input.getKey();
                System.out.println(i+ " "+input.getValue());



        }


    }


        }



