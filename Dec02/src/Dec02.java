import java.util.List;

public class Dec02 extends AOCParent {

    public static void main(String[] args) {
        part1();
        part2();
    }

    public static void part1() {
        List<Box> boxes = InputLoader.loadBoxes();
        startPart(1);

        long total = boxes.stream().mapToLong(Box::surfaceArea).sum();

        System.out.println("Sum of wrapping paper: " + total);

        endPart();
    }

    public static void part2() {
        List<Box> boxes = InputLoader.loadBoxes();
        startPart(2);

        long total = boxes.stream().mapToLong(Box::ribbon).sum();

        System.out.println("Sum of ribbon paper: " + total);

        endPart();
    }
}
