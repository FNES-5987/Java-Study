package ch07.override_Ex.Instrument;

public class Guitar extends Instrument {
    private String guitarSounds;

    public Guitar(String name, String guitarSounds) {
        super(name);
        this.guitarSounds = guitarSounds;
    }
    @Override
    public void play() {
        super.play();
        System.out.println(guitarSounds);
    }
}


