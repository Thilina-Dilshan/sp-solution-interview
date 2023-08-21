package solution.sp.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Problem4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(2);
        list.add(1);
        list.add(9);

        getCombinations1(list);

    }


    private static void getCombinations1(ArrayList<Integer> list) {
        HashSet<Integer> str = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            String s = "";
            s = list.get(i) + "";
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    s += list.get(j) + "";
                    str.add(Integer.parseInt(s));
                }
            }
        }

        for (int i = list.size()-1; i >= 0; i--) {
            String s = "";
            s = list.get(i) + "";
            for (int j = list.size()-1; j >= 0; j--) {
                if (i != j) {
                    s += list.get(j) + "";
                    str.add(Integer.parseInt(s));

                }
            }
        }


        for (int i = 0; i < list.size(); i++) {
            String s = "";
            s = list.get(i) + "";
            for (int j = list.size()-1; j >= 0; j--) {
                if (i != j) {
                    s += list.get(j) + "";
                    str.add(Integer.parseInt(s));
                }
            }
        }

        for (int i = list.size()-1; i >= 0; i--) {
            String s = "";
            s = list.get(i) + "";
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    s += list.get(j) + "";
                    str.add(Integer.parseInt(s));

                }
            }
        }

        TreeSet<Integer> sortList = new TreeSet<>();
        sortList.addAll(str);
        System.out.println(sortList.last());

    }

}