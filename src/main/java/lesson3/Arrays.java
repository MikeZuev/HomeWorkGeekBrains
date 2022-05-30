package lesson3;

public class Arrays {
    public static void main(String[] args) {



    }
    public static void zeroOnesNumbers(int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] == 1){
                a[i] = 0;
            }else{
                a[i] = 1;
            }
        }
    }

    public static void fillArrays(int[]a){
        for(int i = 0; i < 100; i++){
            a[i] = i;
        }
    }

    public static void multiplyNums(int[]a){
        for(int i = 0; i < a.length;i++){
            if(a[i] < 6){
                a[i] = a[i] * 2;
            }
        }
    }

    public static void drawDiagonal(int[][]a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length;j++){
                if(j == j && i == j){
                    a[i][j] = 1;
                }else{
                    a[i][j] = 0;
                }
            }
        }
    }

    public static void minMaxNums(int[] a){
        int i = 0;
        int min = a[i];
        int max = a[i];

        for(i = 0; i < a.length; i++){


            if(a[i] < min){
                min = a[i];
            }else if(a[i] > max){
                max = a[i];
            }

        }
        System.out.println(min);
        System.out.println(max);


    }

    public static boolean arrayNumbers(int[]a) {
        int sumi = 0;
        int sumj = 0;
        for (int i = 0; i < a.length - 1; i++) {
            sumj = 0;
            for (int j =i+1; j < a.length; j++) {
                sumj += a[j];
            }
            sumi += a[i];
            if (sumi == sumj) {
                return true;
            }
        }
        return false;
    }

    public static void moveNumsInArray(int[]a, int n){
        if(n > 0){
            for(int i = 0; i < n; i++){
                int lastNum = a[a.length -1];
                for(int j = a.length - 1; j > 0; j--){
                    a[j] = a[j - 1];
                }
                a[0] = lastNum;
            }
        }else{
            for(int i = 0; i < Math.abs(n); i++){
                int firstNum = a[0];
                for(int j = 0; j < a.length - 1; j++){
                    a[j] = a[j + 1];
                }
                a[a.length - 1] = firstNum;
            }
        }



        }


    public static void printArray(int[] a){
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i]);
        }
    }
    public static void printDoubleArrays(int[][]a){
        for(int i = 0; i < a.length;i++){
            for(int j = 0; j < a.length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }


}
