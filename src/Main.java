import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myValue = 10;
        int anotherValue = myValue;

        System.out.println("My values = " + myValue);
        System.out.println("Another value = " + anotherValue);

        anotherValue++;

        System.out.println("My values = " + myValue);
        System.out.println("Another value = " + anotherValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("Another array= " + Arrays.toString(anotherArray));

        anotherArray[0] = 15;

        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change Another array= " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("After modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After modify Another array= " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5};
    }
}
