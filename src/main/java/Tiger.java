/* Tiger Class */

public class Tiger implements Domesticatable, Tradable, Drivable {
    private int max_speed;

    public Tiger() {
        this.max_speed = 1;
    }

    public Tiger(int maxSpeed) {
        this.max_speed = maxSpeed;
    }

    @Override
    public String sound() {
        return "Roar!";
    }

    @Override
    public int getPrice() {
        return 100000;
    }

    @Override
    public void upgradeSpeed() {
        this.max_speed *= 2;
    }

    @Override
    public void downgradeSpeed() {
        this.max_speed /= 2;
    }

    @Override
    public int getMaxSpeed() {
        return this.max_speed;
    }

    @Override
    public String toString() {
        return "The tiger has a speed of " + this.max_speed + ".";
    }
}
