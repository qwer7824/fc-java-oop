package com.fc;

import com.fc.logic.BubbleSort;
import com.fc.logic.JavaSort;
import com.fc.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}