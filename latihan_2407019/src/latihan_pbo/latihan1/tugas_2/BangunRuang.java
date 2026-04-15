package latihan_pbo.latihan1.tugas_2;

public class BangunRuang extends BangunDatar {
    private int tinggi;

    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public int hitungVolume() {
        return hitungLuas() * tinggi;
    }
} // <--- PASTIKAN ADA KURUNG INI UNTUK MENUTUP CLASS