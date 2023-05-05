package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int i = word.length - 1, j = post.length - 1; i >= 0 && j >= 0; i--, j--) {
            if (word[i] == post[j]) {
                result = true;
            } else if (word[i] != post[j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}