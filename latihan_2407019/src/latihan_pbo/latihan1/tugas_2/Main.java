package latihan_pbo.latihan1.tugas_2;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi objek sesuai data tugas
        int p = 10;
        int l = 5;
        int t = 4;

        BangunRuang balok = new BangunRuang(p, l, t);

        // Menampilkan hasil [cite: 15, 16, 17]
        System.out.println("Luas alas: " + balok.hitungLuas());
        System.out.println("Volume   : " + balok.hitungVolume());
    }

}
