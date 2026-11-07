import java.util.Scanner;

public class SearchNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilai = { 78, 65, 90, 55, 88, 72 };
        int key = 90;
        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari (" + key + ") tidak ditemukan di dalam array.");
        }
        sc.close();
    }

}