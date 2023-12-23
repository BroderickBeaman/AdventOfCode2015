import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Dec04 extends AOCParent {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        part1();
        part2();
    }

    public static void part1() throws NoSuchAlgorithmException {
        startPart(1);

        final String input = "ckczppom";

        int salt = 1;

        MessageDigest md = MessageDigest.getInstance("MD5");

        while(true) {
            String test = input + salt;
            byte[] digest = md.digest(test.getBytes(StandardCharsets.UTF_8));
            if ("00000".equals((byteToHex(digest[0]) + byteToHex(digest[1]) +byteToHex(digest[2])).substring(0, 5))) {
                System.out.println("Answer: " + salt);
                break;
            }
            salt++;
        }

        endPart();
    }

    public static void part2() throws NoSuchAlgorithmException {
        startPart(2);

        final String input = "ckczppom";

        int salt = 1;

        MessageDigest md = MessageDigest.getInstance("MD5");

        while(true) {
            String test = input + salt;
            byte[] digest = md.digest(test.getBytes(StandardCharsets.UTF_8));
            if ("000000".equals((byteToHex(digest[0]) + byteToHex(digest[1]) +byteToHex(digest[2])))) {
                System.out.println("Answer: " + salt);
                break;
            }
            salt++;
        }

        endPart();
    }

    public static String byteToHex(byte num) {
        char[] hexDigits = new char[2];
        hexDigits[0] = Character.forDigit((num >> 4) & 0xF, 16);
        hexDigits[1] = Character.forDigit((num & 0xF), 16);
        return new String(hexDigits);
    }
}
