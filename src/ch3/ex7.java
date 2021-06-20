package ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ex7 implements IntSequence {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Razddf", "Dvadf", "Trisdsdsdsdsds", "4"));
        luckySort(strings, Comparator.comparingInt(String::length));
    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        ArrayList<String> sortedStrings = new ArrayList<>(strings);
        sortedStrings.sort(comp);

        long tries = 0;

        while (!sortedStrings.equals(strings)) {
            tries++;
            System.out.println("Shuffle!");
            Collections.shuffle(strings);
        }

        System.out.println("Sorted= " +sortedStrings);
        System.out.println("Strings= "+strings);
        System.out.println("Tries= "+tries);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int next() {
        return 0;
    }
}
