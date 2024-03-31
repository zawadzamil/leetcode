public class FurthestPointFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        String[] points = moves.split("");

        int countL = 0;
        int countR = 0;

        for (String point : points) {
            if (point.equals("L")) {
                countL++;
            } else if (point.equals("R")) {
                countR++;
            }
        }

        String replace = countL >= countR ? "L" : "R";

        String finalString = moves.replace("_", replace);

        int result = 0;

        for (int i = 0; i < finalString.length(); i++) {
            result = finalString.charAt(i) == 'L' ? result - 1 : result + 1;
        }

        return Math.abs(result);
    }

    public static void main(String[] args) {
        FurthestPointFromOrigin origin = new FurthestPointFromOrigin();
        String moves = "_______";
        System.out.println(origin.furthestDistanceFromOrigin(moves));
    }
}
