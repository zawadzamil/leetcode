public class SqrtX {
    public int mySqrt(int x) {
        double sqrt = Math.sqrt(x);
        return (int) Math.floor(sqrt);
    }

    public static void main(String[] args) {
    SqrtX obj = new SqrtX();
    System.out.println(obj.mySqrt(8));
    }
}
