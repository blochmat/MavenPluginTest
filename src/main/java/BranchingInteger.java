public class BranchingInteger {

    public int x;
    int y;
    private int z = 3;

    public BranchingInteger(int pX, int pY) {
        x = pX;
        y = pY;
    }

    public int max(int a, int b) {
        int result = 0;
        if (a < b) {
            result = b;
        } else {
            result = a;
        }
        return result;
    }

    public int add3(int a, int b, int c) {
        return a + b + c;
    }

    public int addXYZ() {
        int x = 3;
        return x + y + z;
    }

    public int[] array() {
        int[] result = new int[2];
        result[0] = 1;
        result[1] = 2;
        return result;
    }

    public String string() {
        String result = "";
        result = "abc";
        return result;
    }
}
