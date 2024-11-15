import java.util.Scanner;

public class SearchNilai14 {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int[] arrNilai;
        int key, jmlNilai;
        boolean ketemu = false;

        System.out.print("Masukkan Banyaknya Nilai Yang Akan Di Input: ");
        jmlNilai = src.nextInt();
        arrNilai = new int[jmlNilai];

        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = src.nextInt();
        }

        System.out.print("Masukkan Nilai Yang Ingin Dicari: ");
        key = src.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                System.out.println();
                System.out.println("Nilai " + key + " Ketemu, Merupakan Nilai Mahasiswa Ke-" + (i + 1));
                ketemu = true;
            }
        }

        System.out.println();
        if (!ketemu){
            System.out.println("Nilai Tidak Ditemukan");
            System.out.println();
        }
    }
}
