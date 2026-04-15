package latihan_pbo.latihan1.tugas_2;

public class BangunDatar {
    // Atribut private untuk enkapsulasi
    private int panjang;
    private int lebar;

    // Constructor untuk mengisi nilai atribut 
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public int hitungLuas() {
        return panjang * lebar;
    }

    // Getter agar atribut bisa diakses oleh class turunan (jika diperlukan)
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }
}