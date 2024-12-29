
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

    }

    public static int smallest(int[] array) {
        // write your code here
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest(array) == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallestIndex = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {           
            int indexOfsmallestFrom = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfsmallestFrom);

        }
    }
}
