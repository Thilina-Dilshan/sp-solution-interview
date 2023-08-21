package solution.sp.interview;

import java.util.ArrayList;

public class Problem3 {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int out = fib(i);
            arrayList.add(out);
        }
        System.out.println(arrayList);
    }

    private static int fib(int n) {
        if(n == 0)
            return 0;
        else if(n == 1){
            return 1;
        }
        else
            return  fib(n - 1) + fib(n - 2);
    }
}
