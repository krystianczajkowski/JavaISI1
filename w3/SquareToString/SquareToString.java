package w3.SquareToString;

/**
 * SquareToString
 */
public class SquareToString {
    int side;
    static String color;

    SquareToString(int side) {
        this.side = side;
    }

    SquareToString() {
        this(1);
    }

    @Override
    public String toString() {
        return "Square with a " + side + " side";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SquareToString s) {
            return side == s.side;
        }
        return false;
    }

    public static void main(String[] args) {
        SquareToString s1 = new SquareToString(4);
        SquareToString s2 = new SquareToString(4);
        System.out.println(s1.equals(s2));
    }
}
