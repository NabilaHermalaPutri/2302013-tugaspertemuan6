/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package latihanpert6;

/**
 *
 * @author Lenovo
 */
public class LatihanPert6 {

    public static void main(String[] args) {
        // Menampilkan perhitungan segitiga menggunakan kelas
         
         // Mewujudkan objek segitiga 1
         Segitiga objSegitiga1 = new Segitiga();
         // Mencetak perhitungan segitiga dari kelas segitiga
         System.out.println("Segitiga dengan alas: " + objSegitiga1.alas + ", tinggi: " + objSegitiga1.tinggi + ", sisi: " + objSegitiga1.sisi);
         System.out.println("Luasnya: " + objSegitiga1.getLuas());
         System.out.println("Keliling: " + objSegitiga1.getKeliling());
         
         
         // Mewujudkan objek segitiga 2
         Segitiga objSegitiga2 = new Segitiga();
         // Mengset nilai alas, tinggi, dan sisi
         double alasBaru2 = objSegitiga2.alas = 30;
         double tinggiBaru2 = objSegitiga2.tinggi = 10;
         double sisiBaru2 = objSegitiga2.sisi = 90;
         // Mencetak perhitungan segitiga dari kelas segitiga
         System.out.println("Segitiga dengan alas: " + alasBaru2 + ", tinggi: " + tinggiBaru2 + ", sisi: " + sisiBaru2);
         System.out.println("Luasnya: " + objSegitiga2.getLuas());
         System.out.println("Keliling: " + objSegitiga2.getKeliling());
         
         
         // Mewujudkan objek segitiga 3
         Segitiga objSegitiga3 = new Segitiga();
         // Mengset nilai alas, tinggi, dan sisi
         double alasBaru3 = objSegitiga3.alas = 20;
         double tinggiBaru3 = objSegitiga3.tinggi = 30;
         double sisiBaru3 = objSegitiga3.sisi = 60;
         // Mencetak perhitungan segitiga dari kelas segitiga
         System.out.println("Segitiga dengan alas: " + alasBaru3 + ", tinggi: " + tinggiBaru3 + ", sisi: " + sisiBaru3);
         System.out.println("Luasnya: " + objSegitiga3.getLuas());
         System.out.println("Keliling: " + objSegitiga3.getKeliling());
         
         
         // Mewujudkan objek segitiga 4 menggunakan konstruktor
         Segitiga objSegitiga4 = new Segitiga(50, 40, 70);
         System.out.println("Menghitung segitiga dengan kelas dan objek");
         System.out.println("Segitiga dengan alas: " + objSegitiga4.alas + ", tinggi: " + objSegitiga4.tinggi + ", sisi: " + objSegitiga4.sisi);
         System.out.println("Luasnya: " + objSegitiga4.getLuas());
         System.out.println("Keliling: " + objSegitiga4.getKeliling());
    }
}

