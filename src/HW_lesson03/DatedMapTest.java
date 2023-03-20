package HW_lesson03;

public class DatedMapTest {
    public static void main(String[] args) {
        DatedMapImpl map = new DatedMapImpl();
        map.put("Hello", "Ylab");
        map.put("1", "World");
        map.put("Wow", "Yes");
        map.put("Hi", "Yo!");

        System.out.println(map.containsKey("1"));
        System.out.println(map.containsKey("Dummy"));
        System.out.println(map.get("Hello"));
        System.out.println(map.keySet());
        System.out.println(map.getKeyLastInsertionDate("Hello"));
        map.remove("Hello");
        System.out.println(map.getKeyLastInsertionDate("Hello"));
    }
}
