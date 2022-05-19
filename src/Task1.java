import java.util.HashMap;

public class Task1 {
    public Task1(HashMap<String, Integer> hashMap) {
        hashMap.put("oranges", 20);
        hashMap.put("apples", 64);
        hashMap.put("apricot", 1);
        hashMap.put("banana", 202);
        System.out.println(hashMap);
        hashMap.replace("apples", 0);
        System.out.println(hashMap);
        hashMap.put("kiwi", 55);
        System.out.println(hashMap);
    }
}
