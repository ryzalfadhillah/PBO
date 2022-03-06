package latihan.pkg1;

public class Main {

    
    public static void main(String[] args) {
        Radio radio = new Radio(false,50);
        Televisi televisi = new Televisi(false, "Sumsang", false);
        
        radio.on();
        radio.gantiChannel(8);
        radio.perbesarVolume();
        radio.perkecilVolume();
        radio.off();
        System.out.println("");
        televisi.on();
        televisi.Televisi("sumsang");
        televisi.gantiChannel(1);
        televisi.off();
    }
    
}
