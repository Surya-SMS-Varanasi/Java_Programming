import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            long sum = a;
            long power = b;   // starts at 2⁰·b = b

            for (int j = 0; j < n; j++) {
                sum += power;           // accumulate
                System.out.print(sum);
                if (j < n - 1) System.out.print(" "); // no trailing space
                power *= 2;             // 2⁰b → 2¹b → 2²b ...
            }
            System.out.println();
        }
        in.close();
    }
}
