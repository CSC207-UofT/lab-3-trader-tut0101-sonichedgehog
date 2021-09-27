/* A Daniel class that implements Domesticatable and Tradable.
 */
public class Daniel implements Domesticatable, Tradable{
    private int sleekness;

    public Daniel() { this.sleekness = 100; }

    @Override
    public String sound() { return "Yeehaw!"; }

    @Override
    public int getPrice() { return 999; }

    public int getsleekness() { return this.sleekness; }

    public void increaseSleekness() {
        this.sleekness += 10;
    }

    public void decreaseSleekness() {
        this.sleekness -= 10;
    }

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Sleekness: " + this.sleekness + ")";
    }
}
