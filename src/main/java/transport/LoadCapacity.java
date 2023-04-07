package transport;

public enum LoadCapacity {

        N1(0,3.5f),
        N2(3.5f, 12f),
        N3(12f,0);

    private float min;
    private float max;

    LoadCapacity(float min, float max) {
        this.min = min;
        this.max = max;
    }

    public float getMin() {
        return min;
    }

    public float getMax() {
        return max;
    }

    public static LoadCapacity getValue(float value) {
        for (LoadCapacity l : LoadCapacity.values()) {
            if (value >= l.getMin() && value <= l.getMax()) {
                System.out.println(l);
                return l;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "LoadCapacity{" +
                "min=" + min +
                ", max=" + max + super.toString();

    }
}
