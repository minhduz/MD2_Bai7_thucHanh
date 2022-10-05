import Bai2.ComparableCircle;
import javafx.scene.shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class Bai2_Bai3 {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(3.5);
        comparableCircles[1] = new ComparableCircle();
        comparableCircles[2] = new ComparableCircle(3.6);
        System.out.println("Pre-sort");
        for (int i = 0; i < comparableCircles.length; i++) {
            System.out.println(Arrays.toString(comparableCircles));
        }
        Arrays.sort(comparableCircles);
        System.out.println("After-sort");
        for (int i = 0; i < comparableCircles.length; i++) {
            System.out.println(Arrays.toString(comparableCircles));
        }
        System.out.println("\n\n");
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(2.5);
        circles[1] = new Circle(3.4);
        circles[2] = new Circle(1.2);


        Arrays.sort(circles, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                return (int) (o1.getRadius() - o2.getRadius());
            }
        });
        System.out.println("After-sort");
        for (int i = 0; i < circles.length; i++) {
            System.out.println(Arrays.toString(circles));
        }
    }
}
