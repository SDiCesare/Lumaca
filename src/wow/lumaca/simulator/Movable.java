package wow.lumaca.simulator;

/**
 * @author SquraBoot
 * @version 0.1
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public abstract class Movable {

    /**
     * The environment of this {@code Movable}.
     */
    protected Simulator environment;

    /**
     * Class constructor.
     */
    public Movable() {

    }

    /**
     * Moves the item.
     */
    public abstract void act();

    /**
     * @return the stored environment.
     */
    public Simulator getEnvironment() {
        return environment;
    }

    /**
     * Sets the environment of the object.
     *
     * @param s the new {@link Simulator}
     */
    public void setEnvironment(Simulator s) {
        environment = s;
    }

    /**
     * @return the default position of the object.
     */
    public abstract double getDefaultPosition();
}