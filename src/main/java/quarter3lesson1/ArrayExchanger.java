package quarter3lesson1;

public class ArrayExchanger<E> {

    private E[] data;


    private void exchange(int i, int j) {
        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

}
