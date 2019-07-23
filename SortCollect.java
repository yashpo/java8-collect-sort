package com.sb.drools;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortCollect {

	public static void main(String[] args) {
		
		List<Attorney> list = new ArrayList<Attorney>();
        list.add(new Attorney(1, "Alex", "NY"));
        list.add(new Attorney(2, "Harvey", "CA"));
        list.add(new Attorney(3, "Dauna", "MO"));
        list.add(new Attorney(4, "Louis", "MT"));
        list.add(new Attorney(5, "Mike", "TX"));
        list.add(new Attorney(6, "Pearson", "WA"));

        //example 1
        Map result1 = list.stream()
                .sorted(Comparator.comparing(Attorney::getAddress).reversed())
                .collect(
                        Collectors.toMap(
                        		Attorney::getName, Attorney::getAddress, // key = name, value = websites
                                (oldValue, newValue) -> oldValue,       // if same key, take the old key
                                LinkedHashMap::new                      // returns a LinkedHashMap, keep order
                        ));

        System.out.println("Result 1 : " + result1);

	}

}
