package TUGAS;

// Konsep Inheritance: Persegi adalah anak dari BangunDatar
public class Persegi extends BangunDatar {
    private double sisi;

    // Constructor untuk menginput sisi
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public void hitungLuas() {
        // Mengisi variabel 'hasil' yang diwarisi dari parent
        this.hasil = sisi * sisi;
        System.out.print("Luas Persegi: ");
        // Memanggil method 'tampilkanHasil' milik parent
        tampilkanHasil();
    }
}