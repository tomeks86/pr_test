package edu.tseidler;

public class Main {
    public static void main(String[] args) {
        final String str = "abcdef";
        str.chars()
                .mapToObj(i -> (char) i)
                .forEach(System.out::println);
    }
}
