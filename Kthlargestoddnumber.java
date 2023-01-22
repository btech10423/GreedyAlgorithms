import java.util.*;

public class Kthlargestoddnumber {
    public static int kthOdd(int range[], int K) {
        if (K <= 0) 
            return 0;
        int L = range[0];
        int R = range[1];
        if ((R & 1) > 0) {
            int Count = (int) Math.ceil((R - L + 1) / 2);
            if (K > Count)
                return 0;
            else return(R - 2 * K + 2);
        } else {
            int Count = (R - L + 1) / 2;
            if (K > Count)
                return 0;
            else return(R - 2 * K + 1);
        }
    }

    public static void main(String args[]) {
        int[] range = { -10, 10 };
        int K = 8;
        System.out.println(kthOdd(range, K));
    }
}