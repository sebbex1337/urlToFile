package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Need to parse a url and a filename only");
            return;
        }
        UrlToFile utf = new UrlToFile(args[0], args[1]);
        utf.writeToFile();
    }
}