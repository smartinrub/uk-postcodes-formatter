package com.sergiomartinrubio;

public class Main {

    public static void main(String[] args) {
        var list = new String[]{
            "N13LD",
            "EC1A3AD",
            "GU348RR",
            "BH2 6 AU",
            "N19 3QL",
            "EC1V7PA"
        };

        for (final String s : list) {
            System.out.println(validatePostcode(s));
        }
    }

    private static String validatePostcode(String postcode) {
        if (!postcode.matches("^[A-Z]{1,2}[0-9R][0-9A-Z]? [0-9][ABD-HJLNP-UW-Z]{2}$")) {
            postcode = postcode.replace(" ", "");
            StringBuilder sb = new StringBuilder(postcode);
            sb.insert(postcode.length() - 3, " ");
            return sb.toString();
        }
        return postcode;
    }
}
