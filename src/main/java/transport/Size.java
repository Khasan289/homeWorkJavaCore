package transport;

public enum Size {
    XS(0, 10),
    S(0,25),
    M(25,50),
    L(50,80),
    XL(80,120),
    ;

    private int min;
    private int max;

    Size(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
    public static Size getValue(int value) {
        for (Size s : Size.values()) {
            if (value >= s.getMin() && value <= s.getMax()) {
                System.out.println(s);
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Size{" +
                "min=" + min +
                ", max=" + max + super.toString();

    }
}
