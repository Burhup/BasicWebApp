package com.develogical;

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
            return query;
        }

        if (query.toLowerCase().contains("plus")) {
            String q1 = query.substring(query.indexOf("s+")+1);
            return q1.substring(0, q1.indexOf("%")) + q1.substring(q1.indexOf("s+")+4);
        }

        if (query.toLowerCase().contains("Eiffel tower in")) {
            return "Paris";
        }


        return "";
    }
}
