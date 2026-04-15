package latihan_pbo.latihan1.tugas_3;

public class BangunDatar {
    private double varA, varB; 

    // Constructor 1: Dua parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor 2: Satu parameter
    public BangunDatar(double varA) {
        this.varA = varA;
    }

    public double getVarA() { return varA; }
    public double getVarB() { return varB; }

    public double hitungLuas() { return 0; }

    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
    }
}