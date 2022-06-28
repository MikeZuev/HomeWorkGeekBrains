package quarter2lesson2;

public class Main {

    public static void main(String[] args) {


        String[][] numbers = new String[4][4];

        fillUptArrays(numbers);
        printArrays(numbers);
        sumArray(numbers);

    }
    public static void sumArray(String[][] num) {
        int i = 0;
        int j = 0;
        try {

            int result = 0;


            for (i = 0; i < num.length; i++) {
                for (j = 0; j < num.length; j++) {
                    int number = Integer.parseInt(num[i][j]);
                    result += number;
                }
            }
            System.out.println(result);


        }catch(NumberFormatException e){
            try {
                throw new MyArrayDataException();
            } catch (MyArrayDataException ex) {
                System.out.printf("the cell's coordinate are String %d and column %d, %s can't be converted into  int ", i, j, num[i][j]);
                ex.printStackTrace();
            }
        }

    }


    public static void fillUptArrays(String[][] strings)  {

        try{
        int i;
        int j;
        int num = 0;
        String nums = "";

        for(i = 0; i < strings.length; i++){

                if (i >= 4) {
                    throw new MyArraySizeException("The Array's length can't be more than 4 and less than 4");

                }

                for (j = 0; j < strings[i].length; j++) {
                    if(j >= 4){
                        throw new MyArraySizeException("The Array's length can't be more than 4 or less than 4");
                    }
                        nums = String.valueOf(num);

                        strings[i][j] = nums;
                        num++;
                    }
                }



        } catch(MyArraySizeException e){
            e.printStackTrace();
            System.out.println("The array's length can't be this size");
        }
    }

    public static void printArrays(String[][] str){
        int i;
        int j;
        for(i = 0; i < str.length; i++){
            for(j = 0; j < str.length; j++){
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }

    }
}
