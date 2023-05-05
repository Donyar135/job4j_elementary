package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = array.length - 1; index >= 0; index--) {
            result[array.length - index - 1] = array[index];
        }
        return result;
    }
}