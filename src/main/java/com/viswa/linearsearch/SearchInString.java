package com.viswa.linearsearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "visweswara";
        char target = 'z';
        System.out.println(searchInString2(name, target));
    }

    private static boolean searchInString2(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (char element : name.toCharArray()) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    private static boolean searchInString(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
