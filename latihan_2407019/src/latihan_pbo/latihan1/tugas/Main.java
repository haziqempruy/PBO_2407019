package TUGAS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BangunDatar bd = new BangunDatar();

        System.out.println("======= TUGAS PBO: HITUNG BANGUN DATAR =======");
        System.out.println("1. Persegi (Menggunakan Inheritance)");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Belah Ketupat");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        System.out.println("-----------------------------------------------");

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi: ");
                double s = input.nextDouble();
                // Membuat objek dari class anak
                Persegi persegiSatu = new Persegi(s);
                persegiSatu.hitungLuas();
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();
                bd.hitungPersegiPanjang(p, l);
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                bd.hitungSegitiga(a, t);
                break;

            case 4:
                System.out.print("Masukkan Diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan Diagonal 2: ");
                double d2 = input.nextDouble();
                bd.hitungBelahKetupat(d1, d2);
                break;

            default:
                System.out.println("Maaf, pilihan menu tidak tersedia.");
                break;
        }

        input.close();
        System.out.println("===============================================");
    }
}