package quarter2lesson4;

import java.util.Arrays;

public class Threads {
    static final int size = 10_000_000;
    static final int h = size / 2;

    public static void main(String[] args) {
        throughAllArray();
        splitArrays();

    }



    public static void splitArrays(){

        float[] arr = new float[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = 1f;
        }
        long a = System.currentTimeMillis();

        float[] left = new float[h];
        float[] right = new float[h];

        System.arraycopy(arr, 0, left, 0, 5_000_000);
        System.arraycopy(arr, 5_000_000, right,0, 5_000_000);

        Thread thread1 = new Thread(()->{
            for(int i = 0; i < left.length; i++){
                left[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread thread2 = new Thread(()->{
            int b = 5_000_000;
            for(int i = 0; i < right.length; i++){

                right[i] = (float)(arr[b] * Math.sin(0.2f + b / 5) * Math.cos(0.2f + b / 5) * Math.cos(0.4f + b / 2));
                b++;
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        float[] mrdArray = new float[size];
        System.arraycopy(left, 0, mrdArray,0, 5_000_000);
        System.arraycopy(right, 0, mrdArray, 5_000_000, 5_000_000);

        //System.out.println(Arrays.toString(mrdArray));


        System.out.println(System.currentTimeMillis() - a + " is amount of time which takes splitArrays method ");


    }







    public static void throughAllArray(){
        float[] arr = new float[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = 1f;
        }


        long a = System.currentTimeMillis();



        for(int i = 0;i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }


        System.out.println(System.currentTimeMillis() - a + " is the amount of time which takes throughAllArray method ");
        //System.out.println(Arrays.toString(arr));




    }


}
