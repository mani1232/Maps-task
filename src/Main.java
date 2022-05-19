import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    static HashMap<String, Integer> hashMap = new HashMap<>();
    static LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task - 1");
        new Task1(hashMap);
        System.out.println("Task - 2");
        new Task2(scanner, hashMap);
        System.out.println("Task - 3");
        new Task3(linkedHashMap);
        new Task3(scanner, linkedHashMap);
    }
}