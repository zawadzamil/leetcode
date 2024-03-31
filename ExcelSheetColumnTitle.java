import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {


        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) (columnNumber % 26 + 'A');

            columnNumber /= 26;
            result.append(c);
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println(excelSheetColumnTitle.convertToTitle(702));
    }
}