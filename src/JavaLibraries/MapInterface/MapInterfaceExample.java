package JavaLibraries.MapInterface;

import java.util.*;

public class MapInterfaceExample {
    public static void main(String[] args) {
        Map<Integer, String> m = new TreeMap<>();
        m.put(100, "GFG");
        m.put(200, "courses");
        m.put(150, "IDE");
        System.out.println(m);
    }
}
