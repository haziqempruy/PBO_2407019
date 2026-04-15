package latihan_pbo.latihan1.tugas_3;

public class PersegiPanjang extends BangunDatar {
    public PersegiPanjang(double p, double l) { super(p, l); }

    @Override
    public double hitungLuas() { return getVarA() * getVarB(); }

    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar  : " + getVarB());
        System.out.println("Luas   : " + hitungLuas());
    }
}