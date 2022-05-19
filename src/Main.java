import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static HashMap<String, Integer> hashMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Task1(hashMap);
        new Task2(scanner, hashMap);
    }
}