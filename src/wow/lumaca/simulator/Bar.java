package wow.lumaca.simulator;

/**
 * @author SquareBoot
 * @version 0.1
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class Bar extends Movable {

    /**
     * The snail.
     */
    private final Snail snail;
    /**
     * Stores the length of the bar.
     */
    private double length = 1;

    /**
     * Class constructor.
     */
    public Bar(Snail snail) {
        super();
        this.snail = snail;
    }

    /**
     * Moves the item.
     */
    @Override
    public void act() {
        length += 1;
        snail.getEnvironment().updatePosOf(snail, (length * snail.getEnvironment().getPosOf(snail)) / (length - 1));
    }

    /**
     * @return the default position of the object.
     */
    @Override
    public double getDefaultPosition() {
        return 0;
    }

    /**
     * @return the current length of the bar.
     */
    public double getLength() {
        return length;
    }
}