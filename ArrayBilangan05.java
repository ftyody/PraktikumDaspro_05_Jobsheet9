import java.util.Scanner;
import java.util.Arrays;
public class ArrayBilangan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] bil = new int[4];
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        Arrays.sort(bil);
        System.out.println(Arrays.toString(bil));
        sc.close();
    }
}
