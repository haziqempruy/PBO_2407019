package latihan_pbo.latihan1.tugas_2;

public class BangunRuang extends BangunDatar {
    private int tinggi; // Atribut tambahan

    // Constructor BangunRuang
    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar); // Menggunakan constructor Parent
        this.tinggi = tinggi;
    }

    // Method menghitung volume menggunakan hasil hitungLuas()
    public int hitungVolume() {
        return hitungLuas() * tinggi; // Menggunakan kembali method Parent
    }
 {
    
}
