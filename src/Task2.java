import java.util.HashMap;
import java.util.Scanner;

public class Task2 {

    public Task2(Scanner s, HashMap<String, Integer> hashMap) {
        while (true) {
            try {
                System.out.println("Enter key");
                String key = s.next().toLowerCase();
                if (hashMap.containsKey(key)) {
                    System.out.println(hashMap.get(key).intValue());
                } else {
                    System.out.println("Not found this key, created new \nEnter value");
                    hashMap.put(key, s.nextInt());
                }
                System.out.print("""
                        setValue - set value
                        del - delete
                        stop - stop Task2
                        seeAll - see all HashMap
                        """);
                switch (s.next().toLowerCase()) {
                    case "setvalue" -> {
                        System.out.println("Enter new value");
                        hashMap.replace(key, s.nextInt());
                    }
                    case "del" -> hashMap.remove(key);
                    case "stop" -> {
                        return;
                    }
                    case "seeall" -> System.out.println(hashMap);
                    default -> System.out.println("skipped");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
