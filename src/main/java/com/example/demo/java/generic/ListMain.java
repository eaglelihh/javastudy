package com.example.demo.java.generic;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: lihui
 * @date: 2020-06-18
 */
public class ListMain {
    public static void main(String[] args) {
        List<Object> list = Lists.newArrayList();
        list.add("string");
        list.add(2);
        list.add(3.0);
        list.add(null);
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("string");
        // list = list2;
        // a
        // b
    }
}