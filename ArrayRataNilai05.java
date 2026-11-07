import java.util.Scanner;
public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        while (jumlahMahasiswa <= 0) {
            System.out.print("Jumlah mahasiswa harus lebih dari 0. Masukkan kembali: ");
            jumlahMahasiswa = sc.nextInt();
        }

        int[] nilaiMhs = new int[jumlahMahasiswa];
        int total = 0;
        double rataRata;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        rataRata = (double) total / nilaiMhs.length;
        System.out.println("Total nilai mahasiswa: " + total);
        System.out.println("Rata-rata nilai mahasiswa: " + rataRata);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        if (rataRata >= 85) {
            System.out.println("Predikat kelas: SANGAT BAIK");
        } else if (rataRata >= 70) {
            System.out.println("Predikat kelas: BAIK");
        } else {
            System.out.println("Predikat kelas: PERLU PENDAMPINGAN");
        }
        sc.close();     
    }
    
}
