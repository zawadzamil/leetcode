import java.math.BigInteger;

public class AddBinary {
    public String addBinary(String a, String b) {
        return  (new BigInteger(a,2).add(new BigInteger(b,2))).toString(2);
    }

    public static void main(String[] args) {
        AddBinary a = new AddBinary();
        System.out.println(a.addBinary("101100","010011"));
    }
}
