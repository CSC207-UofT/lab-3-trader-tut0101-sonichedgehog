public class bike implements Drivable,Tradable{
    private int maxspeed;

    public bike() {
        this.maxspeed = 2;
    }

    @Override
    public void upgradeSpeed() {

        this.maxspeed = this.maxspeed + 2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxspeed = this.maxspeed - 2;

    }

    @Override
    public int getMaxSpeed() {
        return this.maxspeed;
    }
    @Override
    public int getPrice() {
        return 50;
    }
}
