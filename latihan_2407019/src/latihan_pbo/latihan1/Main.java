package latihan_pbo.latihan1;

// import java.util.Scanner;

class Cafe {
    String nama;
    String alamat;

    // Constructor
    Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        System.out.println(nama);
        System.out.println(alamat);
    }

    // Method
    void buka() {
        System.out.println("Cafe " + nama + " Sudah buka");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        // Catatan: Di foto terdapat baris 'this.alamat = alamat' di setNama, 
        // namun biasanya setter hanya mengubah satu variabel.
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

public class Main {
    public static void main(String[] args) {
        
        // Scanner input = new Scanner(System.in);
        // Cafe cafe = new Cafe();

        // System.out.print("Masukkan nama cafe: ");
        // cafe.nama = input.nextLine();

        // System.out.println("nama yang diinput adalah : " + cafe.nama);
        // cafe.buka();

        // Membuat objek cafe2
        Cafe cafe2 = new Cafe("Janji Jiwa", "Indramayu");
        
        // Mengubah nama menggunakan setter
        cafe2.setNama("kenangan");
        
        // Memanggil method buka
        cafe2.buka();
    }
}