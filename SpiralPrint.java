public class SpiralPrint {
    public static void print(int mat[][]) {
        int x = mat[0].length;
        int y = mat.length;
        int i = 0, j = 0;
        while (x > 0 && y > 0) {
            if (x < 1) {
                break;
            }
            for (int k = 0; k < x; ++k, ++j) {
                System.out.print(mat[i][j] + " ");
            }
            --j; ++i; --y;
            if (y < 1) {
                break;
            }
            for (int k = 0; k < y; ++k, ++i) {
                System.out.print(mat[i][j] + " ");
            }
            --i; --j; --x;
            if (x < 1) {
                break;
            }
            for (int k = x; k > 0; --k, --j) {
                System.out.print(mat[i][j] + " ");
            }
            ++j; --i; --y;
            if (y < 1) {
                break;
            }
            for (int k = y; k > 0; --k, --i) {
                System.out.print(mat[i][j] + " ");
            }
            ++i; ++j; --x;
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int a1[][] = {{1}};
        print(a1);
        int a2[][] = {{1, 2, 3, 4, 5}};
        print(a2);
        int a3[][] = {{1}, {2}, {3}, {4}, {5}};
        print(a3);
        int a4[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, -1, -2}};
        print(a4);
        int a5[][] = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        print(a5);
        int a6[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print(a6);
    }
}
