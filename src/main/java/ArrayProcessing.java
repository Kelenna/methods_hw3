import java.util.Arrays;
import java.util.Scanner;

public class ArrayProcessing {

    public static void main(String[] args) {
        System.out.println("Enter array length and array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(uniqueArray(arr, n)));
    }

    static int[] uniqueArray(int[] arr, int n) {
        int[] cache = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            cache[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (isUnique(cache, arr[i]))
                cache[count++] = arr[i];
        }

        int[] uniqueArray = new int[count];
        System.arraycopy(cache, 0, uniqueArray, 0, uniqueArray.length);

        return uniqueArray;
    }

    static boolean isUnique(int[] cache, int arrElement) {

        for (int i = 0; i < cache.length; i++) {
            if (cache[i] == arrElement) {
                return false;
            }
        }
        return true;
    }

    static int[] uniqueArrayElements(int[] arr1, int[] arr2, int n) {

        return arr1;
    }

    static int[] matchedArrayElements(int[] arr1, int[] arr2, int n) {

        return arr1;
    }

    static int[] reversedArrayElements(int[] arr, int n) {

        return arr;
    }

    static int[] sortedEvenArrayElements(int[] arr, int n) {

        return arr;
    }

}

