package wow.lumaca.simulator;

import java.util.ArrayList;

/**
 * @author SquareBoot
 * @version 0.1
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class Simulator implements Runnable {

    private final ArrayList<Movable> movables = new ArrayList<>();
    private final ArrayList<Double> positions = new ArrayList<>();

    /**
     * Class constructor.
     */
    public Simulator(Movable... objects) {
        for (Movable o : objects) {
            o.setEnvironment(this);
            positions.add(o.getDefaultPosition());
            movables.add(o);
        }
    }

    /**
     * Runs the simulator.
     */
    @Override
    public void run() {
        for (Movable o : movables) {
            o.act();
        }
    }

    /**
     *
     * */
    public void updatePosOf(Movable item, double value) {
        for (int i = 0; i < movables.size(); i++) {
            if (movables.get(i) == item) {
                positions.set(i, value);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid item selected!");
    }

    /**
     *
     * */
    public double getPosOf(Movable item) {
        for (int i = 0; i < movables.size(); i++) {
            if (movables.get(i) == item) {
                return positions.get(i);
            }
        }
        throw new IllegalArgumentException("Invalid item selected!");
    }
}