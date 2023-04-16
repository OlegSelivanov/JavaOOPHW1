package oopHW1;

public class ForChildren extends Product {
    private final int minAge;
    private final String hypoallergenic;
    protected ForChildren(String name, int cost, int quantity, String measure, int minAge, String hypoallergenic) {
        super(name, cost, quantity, measure);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public int getMinAge() {
        return minAge;
    }

    public String getHypoallergenic() {
        return hypoallergenic;
    }
}
