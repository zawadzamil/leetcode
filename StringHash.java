import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringHash {
    public static String generateHash(String input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

        // Convert the byte array to a 10-character string
        StringBuilder hashString = new StringBuilder();
        for (int i = 0; i < 10 && i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hashString.append('0');
            }
            hashString.append(hex.charAt(0));
        }
        return hashString.toString();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String originalString = "1";
        String hashedString = generateHash(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Hashed String (10 characters): " + hashedString);
    }
}


