import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.multiply(3, 1.33485485555));

        Object[] arr1 = new Object[3];

        arr1[0] = "tt";
        arr1[1] = "2";
        arr1[2] = "1";

        Object[] arr2 = new Object[3];
        arr2[0] = "tt";
        arr2[1] = "222";
        arr2[2] = "1";


        System.out.println(CompareArrays.compareArrays(arr1, arr2));

        var pair = new Pair<>(12345, "Текст");
        System.out.println(pair);

    }
}
