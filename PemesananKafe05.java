import java.util.Scanner;

public class PemesananKafe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println();
  
        int jumlahPesanan = 0;
        for ( ; jumlahPesanan <= 0; ) {
            System.out.print("Ingin memesan berapa pesanan? ");
            jumlahPesanan = sc.nextInt();
            sc.nextLine(); 

            if (jumlahPesanan <= 0) {
                System.out.println("Jumlah pesanan harus lebih dari 0, silakan ulangi.");
            }
        }

        String[] pesanan = new String[jumlahPesanan];
        int[] hargaSatuan = new int[jumlahPesanan];
        int[] banyak = new int[jumlahPesanan];
        int[] subtotal = new int[jumlahPesanan];
        int total = 0;

        for (int i = 0; i < pesanan.length; i++) {

            System.out.print("Pesanan ke-" + (i + 1) + " (nama menu): ");
            String nama = sc.nextLine().trim(); 

            boolean ditemukan = false;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(nama)) {
                    pesanan[i] = menu[j];
                    hargaSatuan[i] = harga[j];
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Menu " + nama + " belum ready.");
                i--;
            } else {
                System.out.println(pesanan[i] + " ready");
                System.out.println("harganya Rp " + hargaSatuan[i]);
                System.out.print("Ingin memesan berapa banyak " + pesanan[i] + "? ");
                banyak[i] = sc.nextInt();
                sc.nextLine();

                if (banyak[i] <= 0) {
                    System.out.println("Jumlah harus lebih dari 0");
                    i--;
                } else {
                    subtotal[i] = hargaSatuan[i] * banyak[i];
                    total += subtotal[i];
                }
            }
        }

        System.out.println();
        System.out.println("=========== RINCIAN PESANAN ===========");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " | " + banyak[i] + " x Rp " + hargaSatuan[i] + " = Rp " + subtotal[i]);
        }
        System.out.println("---------------------------------------");
        System.out.println("TOTAL YANG HARUS DIBAYAR: Rp " + total);
        System.out.println("=======================================");

        sc.close();
    }
}