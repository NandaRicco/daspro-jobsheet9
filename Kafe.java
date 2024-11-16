import java.util.Scanner;

public class Kafe {

    public static void main(String[] args) {
        
        Scanner kfe = new Scanner(System.in);

        int jmlPesanan, totalBiaya = 0;
        String [] pesanan;
        int [] harga;
        System.out.print("Masukkan Jumlah Pesanan: ");
        jmlPesanan = kfe.nextInt();
        kfe.nextLine();
        System.out.println();
        
        pesanan = new String [jmlPesanan];
        harga = new int [jmlPesanan];

        for (int i = 0; i < jmlPesanan; i++){
            System.out.print("Pesanan Ke-" + (i + 1) + "   : ");
            pesanan[i] = kfe.nextLine();
            System.out.print("Masukkan Harga : ");
            harga[i] = kfe.nextInt();
            kfe.nextLine();

            totalBiaya += harga[i];
        }
        System.out.println("--------------------------");
        System.out.println("----- Daftar Pesanan -----");
        System.out.println("--------------------------");
        
        for (int i = 0; i < jmlPesanan; i++){
            System.out.println((i + 1) + ". " + pesanan[i] + " Rp. " + harga[i]);
        }
        System.out.println();
        System.out.println("Total Biayanya: Rp. " + totalBiaya);
    }
}
