package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StringPrinter stringPrinter1 = new StringPrinter(new ArrayList<>(Arrays.asList("Привет!", "Я Максим")));
        StringPrinter stringPrinter2 = new StringPrinter(new ArrayList<>(Arrays.asList("Это 3 лабораторная работа", "На java")));
        StringPrinter stringPrinter3 = new StringPrinter(new ArrayList<>(Arrays.asList("Не могу включить фантазию", "Поэтому такие строки")));
        StringPrinter stringPrinter4 = new StringPrinter(new ArrayList<>(Arrays.asList("Вот еще пару строк", "ВАУКУАЧСМ", "ПАМСЧЕКУЕП")));
        stringPrinter1.start();
        stringPrinter2.start();
        stringPrinter3.start();
        stringPrinter4.start();
    }

    synchronized static public void printStrings(List<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}