package figure;

import java.util.Objects;

public class Square extends Figure implements ComputableFigure {

    private String color;
    private final int sideLength;

    public Square() {
         this("White", 1);
        System.out.println("Square default constructor");
    }

    public Square(String color, int sideLength) {
         this.color = color;
         this.sideLength = sideLength;
        System.out.println("Square second constructor");
    }

    public String getColor() {
        return color;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public int computeField() {
        return sideLength * sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return sideLength == square.sideLength &&
                Objects.equals(color, square.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, sideLength);
    }

}
