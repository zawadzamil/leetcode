import java.util.HashMap;
import java.util.Map;

public class JavaDriveIntegrationTest {
    public static void typeCounter(String sentence) {

        String[] split = sentence.split("\\s+");

        Map<String, Integer> data_types = new HashMap<>();
        data_types.put("string", 0);
        data_types.put("integer", 0);
        data_types.put("double", 0);

        for (String word : split) {
            try {
                // Attempt integer conversion first
                data_types.put("integer", data_types.get("integer") + 1);
                int i = Integer.parseInt(word);
            } catch (NumberFormatException intException) {
                try {
                    // If not integer, try double conversion
                    data_types.put("double", data_types.get("double") + 1);
                    double d = Double.parseDouble(word);
                } catch (NumberFormatException doubleException) {
                    // If not double, consider it string
                    data_types.put("string", data_types.get("string") + 1);
                }
            }
        }

        System.out.println("string " + data_types.get("string"));

    }
}


