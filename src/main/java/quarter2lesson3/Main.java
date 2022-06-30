package quarter2lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Dog");
        words.add("Car");
        words.add("House");
        words.add("Dog");
        words.add("Duck");
        words.add("Computer");
        words.add("Dog");
        words.add("Phone");
        words.add("Joystick");
        words.add("Phone");
        words.add("Cat");
        words.add("Dog");

        uniqueWords(words);
        numberOfCopies(words);

        System.out.println();
        System.out.println(words.get(1));

        PhoneBook myBook = new PhoneBook();
        myBook.add("Mike", "93");
        myBook.add("Mike", "01");
        myBook.add("Mike", "033");
        myBook.add("Jane", "111");
        myBook.get("Mike");
        myBook.get("Jane");




    }


    private static void numberOfCopies(ArrayList<String> arr) {
        Map<String, Integer> numberOfCop = new HashMap<>(30);

        int numberCopies = 1;
        for(int i = 0; i < arr.size(); i++){


            for(int j = 0; j < arr.size(); j++){
                if(arr.get(i).equals(arr.get(j))) {
                    numberCopies++;
                }else if (!(arr.get(i).equals(arr.get(j)))){
                    continue;
                }
            }
            numberOfCop.put(arr.get(i),numberCopies);
            numberCopies = 0;

        }
        System.out.println(numberOfCop);

    }

    public static void uniqueWords(ArrayList<String> w){
        HashSet<String> uniqueWords = new HashSet<>(w);
        System.out.println(uniqueWords);

    }
    public static  void printUniqueWords(HashSet<String> w){





    }
}
