package Basic;

public class K {

    public static void main(String[] args) {
        K k = new K();
        int[][] a = k.a(-5);
        k.c(a);

        // k.b(a);
        System.out.println("Number:" + k.b(a));
        int v = 11;
        int n = k.d(v, a);
        System.out.println("Position of " + v + " is " + n);
    }

    public int[][] a(int n) {
        if (n < 1) {
            return null;
        }
        int[][] tmp = new int[n][];

        int i = 0; //row index
        while (i < n) {
            tmp[i] = new int[i + 1];
            i = i + 1;
        }
        return tmp;
    }

    public int b(int[][] a) {
        int n = 0;
        try {
            for (int i = 0; i < a.length; ++i) {
                for (int j = 0; j < a[i].length; ++j) {
                    System.out.print(a[i][j] + " ");
                    n = n + 1;
                }
            }
            System.out.println("");
        } catch (NullPointerException e) {
            System.out.println("Null: array");
        }

        return n;
    }

    public void c(int[][] a) {
        int n = 1;
        try {
            for (int[] t : a) {
                for (int i = 0; i < t.length; ++i) {
                    t[i] = n;
                    // System.out.println("x"+"="+x);
                    n = n + 1;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Null: array");
        }
    }

    public int d(int value, int[][] a) {
        //row index
        int r = 0;
        //number of value
        int n = 0;
        M:
        do {
            //column index
            int c = 0;
            do {
                n = n + 1;
                try {
                    if (a[r][c] == value) {
                        break M;
                    }
                } catch (NullPointerException e) {
                    System.out.println("Error : Null Array");
                    return -1;
                }

                c = c + 1;
            } while (c < a[r].length);
            r = r + 1;
        } while (r < a.length);
        return n;
    }

}
