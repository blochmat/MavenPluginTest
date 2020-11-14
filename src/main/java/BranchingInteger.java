public class BranchingInteger {

    int field = 0;

    public int max(int a, int b) {
        int result = 0;
        if (a < b) {
            result = b;
        } else {
            result = a;
        }
        return result;
    }

    public int defCoveredNoPairs(int x, int y) {
        if (y < 3) {
            return x;
        } else {
            return y;
        }
    }

    public void increaseField() {
        int z = 0;
        z = z + 1;
        System.out.println(z);

        this.field = this.field + 1;
        System.out.println(this.field);
        System.out.println(this);
    }

    public int foo(int x) {
        if (x > 3) {
            return x;
        } else {
            return x + 1;
        }

    }

    public int callFoo(int bar) {
        return foo(bar);
    }

    public int getField() {
        return field;
    }

    public void setField(int x) {
        this.field = x;
    }

    public void modifyPar(BranchingInteger x) {
        x.increaseField();
    }

    public int loop() {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result++;
        }
        return result;
    }

    public int add(int x) {
        x = x + 1;
        return x;
    }
}
