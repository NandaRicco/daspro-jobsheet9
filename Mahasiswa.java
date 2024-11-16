import java.util.Scanner;

public class Mahasiswa {
    
    public static void main(String[] args) {
        
        Scanner mhs = new Scanner(System.in);

        int jmlMhs, nilaiTinggi, nilaiRendah;
        double rataRata, total = 0;

        System.out.print("Masukkan jumlah Mahasiswa : ");
        jmlMhs = mhs.nextInt();

        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = mhs.nextInt();
        }

        nilaiTinggi = nilaiMhs[0];
        nilaiRendah = nilaiMhs[0];
        
        System.out.println("-----------------------------------");
        System.out.println("Semua Nilai Yang Telah Dimasukkan:");
        System.out.println("-----------------------------------");
        for (int i = 0; i < jmlMhs; i++){
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
            total += nilaiMhs[i];
            if (nilaiMhs[i] > nilaiTinggi){
                nilaiTinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiRendah){
                nilaiRendah = nilaiMhs[i];
            }
        }
        rataRata = total/nilaiMhs.length;
        System.out.println("Rata rata nilai adalah : " + rataRata);
        System.out.println("Nilai tertinggi adalah : " + nilaiTinggi);
        System.out.println("Nilai terendah adalah  : " + nilaiRendah);
    }
}
