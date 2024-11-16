import java.util.Scanner;

public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMhs;
        int jmlLulus = 0, jmlTidakLulus = 0;
        int totalLulus = 0, totalTidakLulus = 0;
        double rataRataLulus = 0, rataRataTidakLulus = 0;

        System.out.print("Masukkan jumlah Mahasiswa : ");
        jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < jmlMhs; i++) {
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                jmlTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        if (jmlLulus > 0) {
            rataRataLulus = (double) totalLulus / jmlLulus;
        }
        if (jmlTidakLulus > 0) {
            rataRataTidakLulus = (double) totalTidakLulus / jmlTidakLulus;
        }

        System.out.println("Rata rata nilai lulus       : " + rataRataLulus);
        System.out.println("Rata rata nilai tidak lulus : " + rataRataTidakLulus);
    }
}