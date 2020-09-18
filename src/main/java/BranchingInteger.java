public class BranchingInteger {

    public int x = 1;
    int y = 2;
    private int z = 3;

    public int getZ() {
        return z;
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
}
