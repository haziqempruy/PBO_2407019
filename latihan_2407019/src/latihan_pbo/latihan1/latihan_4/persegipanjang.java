package latihan_pbo.latihan_4;

public class persegipanjang extends BangunDatar {

    public double LuasPersegiPanjang(){
        return (getPanjang()*getLebar());
    }

    public double hitungKelilingPersegiPanjang(){
        return 2 * (getPanjang() + getLebar());
    }
    
}
