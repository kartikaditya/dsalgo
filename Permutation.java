import java.util.Set;
import java.util.HashSet;

class Permutation {
    private static void print(int p[]) {
        for (int i = 0; i < p.length; ++i) {
            System.out.print(p[i] + " ");
        }
        System.out.println();
    }
    private static void swap(int p[], int i, int j) {
        int temp = p[i];
        p[i] = p[j];
        p[j] = temp;
    }
    private static boolean next(int p[]) {
        int i = p.length - 1;
        for (; i > 0 && p[i - 1] >= p[i]; --i) {}
        if (i == 0) {
            return false;
        }
        for (int start = i, end = p.length - 1; start < end; ++start, --end) {
            swap(p, start, end);
        }
        int j = i;
        for (; p[j] <= p[i - 1]; ++j) {}
        swap(p, i - 1, j);
        return true;
    }
    public static void printPermutations1(int p[]) {
        int cnt = 0;
        do {
            print(p);
            ++cnt;
        } while(next(p));
        System.out.println(cnt);
    }
    private static void printPermutations2(int p[], int i, int cnt[]) {
        if (i == p.length) {
            print(p);
            ++cnt[0];
            return;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int j = i; j < p.length; ++j) {
            if (set.contains(p[j])) {
                continue;
            }
            swap(p, i, j);
            printPermutations2(p, i + 1, cnt);
            swap(p, i, j);
            set.add(p[j]);
        }
    }
    public static void printPermutations2(int p[]) {
        int cnt[] = {0};
        printPermutations2(p, 0, cnt);
        System.out.println(cnt[0]);
    }
    public static void main(String args[]) {
        int p1[] = {1, 2, 3, 4};
        int p2[] = {1, 1, 2, 2};
        int p3[] = {1, 1, 2, 2, 3, 3};
        printPermutations2(p1);
        System.out.println("=================================");
        printPermutations2(p2);
        System.out.println("=================================");
        printPermutations2(p3);
    }
}
