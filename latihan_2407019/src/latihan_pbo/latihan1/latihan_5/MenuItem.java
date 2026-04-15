package latihan_pbo.latihan1.latihan_5;

public class MenuItem extends Menu {
    private int jumlah;

    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga); // Memanggil constructor Parent
        this.jumlah = jumlah;
    }

    // Override hitungTotal: Harga x Jumlah sesuai instruksi
    @Override
    public double hitungTotal() {
        return getHarga() * jumlah;
    }

    public int getJumlah() { return jumlah; }
}