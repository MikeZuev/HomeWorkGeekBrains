package quarter2lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private String name;
    private String number;

    static Map<String, ArrayList<String>> phoneBook = new HashMap<>();


   public  void add(String name, String number){
       if(phoneBook.get(name) == null){
           phoneBook.put(name, new ArrayList<>());
           phoneBook.get(name).add(number);
       }else{
           phoneBook.get(name).add(number);
       }



   }

   public  void get(String name){
       System.out.println(name);
       System.out.println(phoneBook.get(name)
       );

   }
}