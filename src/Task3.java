import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {

    public Task3(LinkedHashMap<String, String> linkedHashMap) {
        String ChangeMailName = "Katya";
        String NewMail = "newkatya@mail.ua";
        linkedHashMap.put("Nikita", "nikita@mail.ua");
        linkedHashMap.put("Katya", "katya@mail.ua");
        linkedHashMap.put("Andrey", "andrey@mail.ua");
        linkedHashMap.put("Nikolay", "nikolay@mail.ua");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " Mail: " + entry.getValue());
            if (entry.getValue().equals(ChangeMailName)) {
                linkedHashMap.replace(entry.getKey(), NewMail);
            }
        }
    }

    public Task3(Scanner s, LinkedHashMap<String, String> linkedHashMap) {
        while (true) {
            try {
                System.out.println("Enter key");
                String key = s.next().toLowerCase();
                if (linkedHashMap.containsKey(key)) {
                    System.out.println(linkedHashMap.get(key));
                } else {
                    System.out.println("Not found this key, created new \nEnter value");
                    linkedHashMap.put(key, s.next());
                }
                System.out.print("""
                        setMail - set Mail
                        del - delete
                        stop - stop Task3
                        seeAll - see all LinkedHashMap
                        """);
                switch (s.next().toLowerCase()) {
                    case "setmail" -> {
                        System.out.println("Enter new Mail");
                        linkedHashMap.replace(key, s.next());
                    }
                    case "del" -> linkedHashMap.remove(key);
                    case "stop" -> {
                        return;
                    }
                    case "seeall" -> System.out.println(linkedHashMap);
                    default -> System.out.println("skipped");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
