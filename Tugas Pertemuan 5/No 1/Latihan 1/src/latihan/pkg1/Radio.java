package latihan.pkg1;

public class Radio implements InterfaceElektronik,InterfaceChannelTV{
    boolean mesin;
    int volume;

    public Radio(boolean mesin, int volume) {
        this.mesin = mesin;
        this.volume = volume;
    }
    
    @Override
    public void on() {
        mesin = true;
        System.out.println("Radio nyala");
    }

    @Override
    public void off() {
        mesin = false;
        System.out.println("Radio mati");
    }

    @Override
    public void gantiChannel(int c) {
        System.out.println("Ganti ke channel no " + c);
    }

    public void perbesarVolume(){
        volume++;
        System.out.println("Volume : " + volume);
    }
    
    public void perkecilVolume(){
        volume--;
        System.out.println("Volume : " + volume);
    }
}
