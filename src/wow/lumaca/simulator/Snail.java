package wow.lumaca.simulator;

/**
 * @author SquareBoot
 * @version 0.1
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class Snail extends Movable {

    /**
     * Class constructor.
     */
    public Snail() {
        super();
    }

    @Override
    public void act() {
        getEnvironment().updatePosOf(this, getEnvironment().getPosOf(this) + 0.01);
    }

    /**
     * @return the default position of the object.
     */
    @Override
    public double getDefaultPosition() {
        return 0.5;
    }
}