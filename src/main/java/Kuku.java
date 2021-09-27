public class Kuku implements Drivable, Domesticatable, Tradable {
    private int netWorth;
    private int maxSpeed;

    public Kuku() {
        this.netWorth = 1000;
        this.maxSpeed = 69;
    }

    @Override
    public String sound() {
        return "kukuku!";
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 6900;
    }
    public int getNetWorth(){
        return this.netWorth;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")" + " (" + "Worth: " + this.netWorth + ")";
    }
}
