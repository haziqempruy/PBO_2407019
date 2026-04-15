package latihan_pbo.latihan1.latihan_5;

public class Menu {
    private String nama;
    private double harga;

    // Constructor untuk inisialisasi nama dan harga
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter untuk akses data
    public String getNama() { return nama; }
    public double getHarga() { return harga; }

    // Method hitungTotal dengan nilai default 0 sesuai instruksi
    public double hitungTotal() {
        return 0;
    }
}