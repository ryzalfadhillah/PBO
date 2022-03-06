package latihan.pkg1;

public class Televisi implements InterfaceElektronik,InterfaceChannelRadio{
    boolean mesin;
    String merk;
    boolean listrik;

    public Televisi(boolean mesin, String merk, boolean listrik) {
        this.mesin = mesin;
        this.merk = merk;
        this.listrik = listrik;
    }
    
    public void Televisi(String merk){
        System.out.println("Merk TV : " + merk);
    }

    @Override
    public void on() {
        mesin = true;
        System.out.println("TV nyala");
    }

    @Override
    public void off() {
        mesin = false;
        System.out.println("TV mati");
    }

    @Override
    public void gantiChannel(int c) {
        System.out.println("Ganti ke channel no " + c);
    }
    
}
