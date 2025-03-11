package Semester_2.Praktikum;

import java.util.Scanner;

public class mainMobil {
    public static void main(String[] args) {
        // instan objek scanner untuk meminta input dari user (no. 3)
        Scanner sc = new Scanner(System.in);
        // instan objek bernama m1
        Mobil m1 = new Mobil();
        System.out.print("Masukkan kecepatan mobil (km/jam): ");
        m1.setKecepatan(sc.nextInt());
        // konsumsi enter
        sc.nextLine();
        System.out.print("Masukkan manufaktur mobil: ");
        m1.setManufaktur(sc.nextLine());
        System.out.print("Masukkan nomor plat mobil: ");
        m1.setNoPlat(sc.nextLine());
        System.out.print("Masukkan warna mobil: ");
        m1.setWarna(sc.nextLine());
        System.out.println("Masukkan waktu tempuh mobil dalam jam: ");
        m1.setWaktu(sc.nextDouble());
        m1.displayMessage();
        System.out.println("====================================");
        // instan objek baru bernama m2
        Mobil m2 = new Mobil();
        System.out.print("Masukkan kecepatan mobil (km/jam): ");
        m2.setKecepatan(sc.nextInt());
        // konsumsi enter
        sc.nextLine();
        System.out.print("Masukkan manufaktur mobil: ");
        m2.setManufaktur(sc.nextLine());
        System.out.print("Masukkan nomor plat mobil: ");
        m2.setNoPlat(sc.nextLine());
        System.out.print("Masukkan warna mobil: ");
        m2.setWarna(sc.nextLine());
        System.out.println("Masukkan waktu tempuh mobil dalam jam: ");
        m2.setWaktu(sc.nextDouble());
        m2.displayMessage();
        System.out.println("====================================");
        // merubah warna dari objek m1
        System.out.println("Mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");
        // menampilkan hasil perubahan
        m1.displayMessage();
    }
}
