
public class Hedgehog implements Tradable, Domesticatable {
    private int spikiness;

    public Hedgehog(int spikiness) {
        this.spikiness = spikiness;
    }

    public void strokeHog() {
        if (spikiness > 5) {
            System.out.println("This hedgehog is too spikey!");
        } else {
            System.out.println(this.sound());
        }
    }

    @Override
    public int getPrice() {
        return 420;
    }

    public String sound() {
        return "SKREEEEE.";
    }

    @Override
    public String toString() {
       String id = super.toString();
       return id + " (Spikiness: " + this.spikiness + "/10)";
    }
}
