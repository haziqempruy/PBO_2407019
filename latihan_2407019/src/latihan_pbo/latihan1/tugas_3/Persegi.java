package latihan_pbo.latihan1.tugas_3;

public class Persegi extends BangunDatar {
    
    // Constructor sesuai instruksi: hanya 1 parameter sisi 
    public Persegi(double sisi) {
        super(sisi); 
    }

    @Override
    public double hitungLuas() {
        // Menggunakan varA sebagai representasi sisi
        return getVarA() * getVarA();
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("Sisi: " + getVarA()); // Output sesuai permintaan [cite: 42]
        System.out.println("Luas: " + hitungLuas()); // Output sesuai permintaan [cite: 43]
    }
}