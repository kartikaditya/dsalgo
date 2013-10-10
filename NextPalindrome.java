public class NextPalindrome {
    private static String rev(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static int next(int n) {
        String nStr = String.valueOf(n);
        int index = (nStr.length() + 1) >> 1;
        String first = nStr.substring(0, index);
        String last = nStr.substring(index);
        String midChar = "";
        if ((nStr.length() & 1) == 1) {
            index = first.length() - 1;
            midChar = first.substring(index, index + 1);
            first = first.substring(0, index);
        }
        String firstRev = rev(first);
        if (firstRev.compareTo(last) > 0) {
            return Integer.parseInt(first + midChar + firstRev);
        }
        first = first + midChar;
        String newFirst = String.valueOf(Integer.parseInt(first) + 1);
        String newFirstRev = null;
        if (newFirst.length() > first.length()) {
            return n + 2;
        } else {
            if ((nStr.length() & 1) == 1) {
                newFirstRev = rev(newFirst.substring(0, newFirst.length() - 1));
            } else {
                newFirstRev = rev(newFirst);
            }
        }
        return Integer.parseInt(newFirst + newFirstRev);
    }
    public static void main(String args[]) {
        for (int i = 0; i <= 10000; ++i) {
            System.out.println(i + " -> " + next(i));
        }
    }
}
