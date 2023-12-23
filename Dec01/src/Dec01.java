public class Dec01 extends AOCParent {
    public static void main(String[] args) {
        part1();
        part2();
    }

    public static void part1() {
        String input = InputLoader.loadInput();
        startPart(1);

        long floor = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                floor++;
            } else {
                floor--;
            }
        }

        System.out.println("Floor number: " + floor);
        endPart();
    }

    public static void part2() {
        String input = InputLoader.loadInput();
        startPart(2);

        long floor = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                floor++;
            } else {
                floor--;
            }

            if (floor < 0) {
                System.out.println("Index of basement: " + (i + 1));
                break;
            }
        }

        endPart();
    }
}
