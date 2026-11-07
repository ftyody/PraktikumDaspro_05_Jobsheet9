import java.util.Scanner;
public class PengelolaanNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah;
        do {
            System.out.print("Masukkan banyaknya nilai mahasiswa: ");
            jumlah = sc.nextInt();
            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0, silakan ulangi.");
            }
        } while (jumlah <= 0);

        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        rata2 = (double) total / nilaiMhs.length;

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }

        System.out.println();
        System.out.println("=== Daftar Nilai Mahasiswa ===");
        int jumlahLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            if (nilaiMhs[i] > 70) jumlahLulus++;
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " (" + status + ")");
        }

        System.out.println();
        System.out.println("=== Ringkasan ===");
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah LULUS: " + jumlahLulus);
        System.out.println("Jumlah TIDAK LULUS: " + (nilaiMhs.length - jumlahLulus));

        sc.close();
    }
}