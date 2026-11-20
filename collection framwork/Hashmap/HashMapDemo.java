package Hashmap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //create HashMap
        HashMap<Integer,String> map = new HashMap<>();
        //add data
        map.put(101, "rahul");
        map.put(102, "ajhar");
        map.put(103, "mansur");
        //get value
        System.out.println(map.get(101));
        //check key
        System.out.println(map.containsKey(102));
        //remove data
        map.remove(103);
        //itreate
        for(Integer key : map.keySet()){
            System.out.println(key + " : "+map.get(key));
        }
    }
}
