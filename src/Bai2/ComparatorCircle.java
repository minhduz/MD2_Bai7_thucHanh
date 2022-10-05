package Bai2;

import java.util.Comparator;

public class ComparatorCircle extends Circle implements Comparator<Circle> {

    public ComparatorCircle() {
    }

    @Override
    public int compare(Circle o1, Circle o2) {
        return (int) (o1.getRadius() - o2.getArea());
    }
}
