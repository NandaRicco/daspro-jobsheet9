import java.util.Scanner;

public class Kafe2 {

    public static void main(String[] args) {

        Scanner kfe = new Scanner(System.in);

        String namaMakanan;
        String[] menu = {
                "Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"
        };
        boolean makanan = false;
        
        System.out.println();
        System.out.println("------- Selamat Datang di Kafe Hits -------");
        System.out.println();

        System.out.print("Masukkan Nama Makanan Yang Ingin Dicari: ");
        namaMakanan = kfe.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(namaMakanan)) {
                System.out.println();
                System.out.println("Makanan " + namaMakanan + " tersedia di menu");
                makanan = true;
                break;
            }
        }

        if (!makanan){
            System.out.println();
            System.out.println("Maaf, Makanan " + namaMakanan + " tidak ada dalam menu");
        }
    }
}
