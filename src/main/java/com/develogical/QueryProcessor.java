package com.develogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("team name")) {
            return "Little Fuus";
        }

        if (query.toLowerCase().contains("is the largest")) {
            String numbers_string = query.substring(query.indexOf("largest:")+9);

            List<String> numbers = Arrays.asList(numbers_string.split(", "));

            List<Integer> numbersInt = new ArrayList<>();
            for (String number : numbers) {
                numbersInt.add(Integer.valueOf(number));
            }

            List<Integer> sortedlist = new ArrayList<>(numbersInt);

            // sort list in natural order
            Collections.sort(sortedlist);

            // last element in the sorted list
            // would be maximum
            int result = sortedlist.get(sortedlist.size() - 1);

            return Integer.toString(result);
        }

//        if (query.toLowerCase().contains("plus")) {
//            String q1 = query.substring(query.indexOf("s+")+1);
//            return q1.substring(0, q1.indexOf("%")) + q1.substring(q1.indexOf("s+")+4);
//        }

        if (query.toLowerCase().contains("eiffel tower in")) {
            return "paris";
        }

        if (query.toLowerCase().contains("what colour is a banana")) {
            return "yellow";
        }

        if (query.toLowerCase().contains("james bond")) {
            return "sean connery";
        }

        if (query.toLowerCase().contains("fibonnaci sequence")) {

        }


        return "";
    }
}
