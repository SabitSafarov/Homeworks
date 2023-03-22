package homework1;

public class TaskMergeSort {
    public static void main(String[] args) {
        int [] array = {21, 43, 12, 17, 35, 27};

        int [] mergeSortedArray = sortArray(array);
        for (int i : mergeSortedArray) {
            System.out.print(i + " ");
        }
    }

    private static int [] sortArray(int [] array) {
        if (array.length < 2) {
            return array;
        }

        int [] array1 = new int[array.length / 2];
        int [] array2 = new int[array.length - array1.length];

        System.arraycopy(array, 0, array1, 0, array.length / 2);
        System.arraycopy(array, array.length / 2, array2, 0, array.length - array1.length);

        array1 = sortArray(array1);
        array2 = sortArray(array2);

        return mergeArray(array1, array2);

    }

    private static int [] mergeArray(int [] array1, int [] array2) {
        int indexArr1 = 0;
        int indexArr2 = 0;

        int [] resaultArr = new int[array1.length + array2.length];

        for (int i = 0; i < resaultArr.length; i++) {
            if (indexArr1 == array1.length) {
                resaultArr[i] = array2[indexArr2];
                indexArr2++;
            } else if (indexArr2 == array2.length) {
                resaultArr[i] = array1[indexArr1];
                indexArr1++;
            } else if (array1[indexArr1] < array2[indexArr2]) {
                resaultArr[i] = array1[indexArr1];
                indexArr1++;
            } else {
                resaultArr[i] = array2[indexArr2];
                indexArr2++;
            }
        }
        return resaultArr;
    }
}