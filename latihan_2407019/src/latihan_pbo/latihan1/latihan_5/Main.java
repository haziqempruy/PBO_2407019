package latihan_pbo.latihan1.latihan_5;

public class Main {
    public static void main(String[] args) {

        MenuItem pesanan = new MenuItem("Kopi Janji Jiwa", 20000, 3);

        // Menampilkan output
        System.out.println("=== DETAIL PESANAN ===");
        System.out.println("Nama Menu  : " + pesanan.getNama());
        System.out.println("Harga Satuan: " + pesanan.getHarga());
        System.out.println("Jumlah Beli : " + pesanan.getJumlah());
        System.out.println("-----------------------");
        System.out.println("Total Bayar : " + pesanan.hitungTotal());
    }
}