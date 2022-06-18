package JavaLibraries.MapInterface;

import java.util.*;

public class MapInterfaceExample {
    public static void main(String[] args) {
        Map<Integer, String> m = new TreeMap<>();
        m.put(100, "GFG");
        m.put(200, "courses");
        m.put(150, "IDE");
        m.put(100, "haha"); // changes the 100 value to haha
        System.out.println(m);
    }
}
