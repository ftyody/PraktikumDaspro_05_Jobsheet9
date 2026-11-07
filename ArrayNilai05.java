import java.util.Scanner;
public class ArrayNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "(Lulus)" : "(Tidak Lulus)";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " : " + status);
        }
        sc.close();
    }
}
