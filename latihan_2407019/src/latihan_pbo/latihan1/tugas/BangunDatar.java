package TUGAS;

public class BangunDatar {
    // Protected (#) agar bisa diakses langsung oleh class anak (Persegi)
    protected double hasil;

    // Method Public (+) untuk mencetak hasil perhitungan
    public void tampilkanHasil() {
        System.out.println(hasil);
    }

    // Method untuk bangun datar lainnya yang belum dibuatkan class anaknya
    public void hitungPersegiPanjang(double p, double l) {
        this.hasil = p * l;
        System.out.print("Luas Persegi Panjang: ");
        tampilkanHasil();
    }

    public void hitungSegitiga(double a, double t) {
        this.hasil = 0.5 * a * t;
        System.out.print("Luas Segitiga: ");
        tampilkanHasil();
    }

    public void hitungBelahKetupat(double d1, double d2) {
        this.hasil = 0.5 * d1 * d2;
        System.out.print("Luas Belah Ketupat: ");
        tampilkanHasil();
    }
}