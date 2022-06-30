import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        //inisialisasi 1
        //deklarasi manual
        String[] stringArray;
        stringArray = new String[3];

        stringArray [0] = "Robin";
        stringArray [1] = "Bastian";
        stringArray [2] = "Aritonang";

        System.out.println("SUAMI");
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        //inisialisasi 2
        String[] stringArray2 = new String[3];

        stringArray2 [0] = "Florentina";
        stringArray2 [1] = "Widya";
        stringArray2 [2] = "Lestari";

        System.out.println();
        System.out.println("ISTRI");
        System.out.println(stringArray2[0]);
        System.out.println(stringArray2[1]);
        System.out.println(stringArray2[2]);

        //Array Initializer
        //dapat dipersingkat
        String[] namaNama = {
                "Robin", "Bastian", "Aritonang"
        };
        System.out.println(Arrays.toString(namaNama));

    }

}
