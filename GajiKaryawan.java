import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        
        double jamKerja, tarif, pajak, totalGaji;
        pajak=10;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah jam kerja: ");
        jamKerja = input.nextDouble();
        System.out.println("Masukkan tarif per jam: ");
        tarif = input.nextDouble();

        totalGaji = jamKerja*tarif;
        pajak = pajak/100*totalGaji;
        totalGaji = totalGaji - pajak;
        System.out.println("Total gaji yang diterima karyawan setelah potongan pajak: "+totalGaji);
    }
}