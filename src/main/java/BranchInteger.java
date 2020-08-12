public class BranchInteger {

    public int max(int a, int b) {
        int result = 0;
        if (a < b) {
            result = b;
        } else {
            result = a;
        }
        return result;
    }
}
