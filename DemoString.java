/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;

/**
 *
 * @author java
 */
public class DemoString {

    public static void main(String[] args) {
        String s = "test  Message erwer tring";
        char c = 's';
        System.out.println("Count: " + countChar(s, c));
        System.out.println("Count words: " + countWords(s));
        System.out.println("First word: " + firstWord(s));

    }

    public static int countChar(String s, char c) {
        if (s == null || s.isEmpty()) {

            return -1;
        }
        int n = 0;
        int p = 0;
        while ((p = s.indexOf(c, p)) > -1) {
            ++n;
            if (p < s.length() - 1) {
                ++p;
            } else {
                break;
            }

        }
        return n;
    }

    public static int countWords(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }

        return s.split("\\s+").length;

    }

    public static String firstWord(String s) {
        if (s == null || s.trim().isEmpty()) {
            return null;
        }

        String[] a = s.split("\\s+");
        String first = a[0];
        for (String tmp : a) {
            if (first.compareTo(tmp) > 0) {
                first = tmp;

            }
        }
        return first;
    }
}
    