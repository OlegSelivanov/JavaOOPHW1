package oopHW1;

public class ForBath extends Product{
    private final int size;

    protected ForBath(String name, int cost, int quantity, String measure, int size) {
        super(name, cost, quantity, measure);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
