package ch07.override_Ex.Instrument;

public class Piano extends Instrument {
    private String pianoSounds;

    public Piano(String name, String pianoSounds) {
        super(name);
        this.pianoSounds = pianoSounds;
    }
    @Override
    public void play() {
        super.play();
        System.out.println(pianoSounds);
    }
}
