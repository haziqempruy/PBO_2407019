package latihan_pbo.latihan1.tugas_3;

public class Main {
    public static void main(String[] args) {
        // Menggunakan tipe variabel yang sama (BangunDatar) untuk berbagai objek 
        BangunDatar bd;

        bd = new Persegi(5.0);
        bd.tampilkan(); // Output sesuai instruksi
        System.out.println();

        bd = new PersegiPanjang(10.0, 5.0);
        bd.tampilkan();
        System.out.println();

        bd = new Segitiga(6.0, 8.0);
        bd.tampilkan();
    }
}