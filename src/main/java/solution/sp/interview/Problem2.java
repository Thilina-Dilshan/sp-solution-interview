package solution.sp.interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {

        List<String> strList  = new ArrayList<>();
        List<Integer> intList  = new ArrayList<>();

        String[] str = new String[]{"a", "b", "c"};
        strList = Arrays.asList(str);

        for (int i = 1; i < 4; i++) {
            intList.add(i);
        }

        /* Code developed Assuming 2 List have the same length */
        ArrayList<String> output = new ArrayList<>();

        for (int i = 0; i < strList.size(); i++) {
            output.add(strList.get(i));
            output.add(intList.get(i) + "");
        }

        System.out.println(output);


    }
}
