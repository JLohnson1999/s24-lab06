package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean[] getOccupied() {
        return this.occupied;
    }

    public boolean isValid(int position) {
        if (position < 0) return false;
        boolean[] occupied = this.getOccupied();
        return position < occupied.length;
    }

    // TODO: Do you notice any issues here?
    public boolean isOccupied(int position) {
        boolean[] occupied = this.getOccupied();
        return occupied[position];
    }
}
