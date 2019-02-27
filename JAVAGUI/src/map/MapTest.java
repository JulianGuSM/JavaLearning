package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * this program demonstrates the use of a map with key type String and Value Employee
 * @author : Julian
 * @date : 2019/2/27 10:39
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>(16);
        staff.put("1", new Employee());
        staff.put("2", new Employee());

        System.out.println(staff);

        staff.remove("1");

        staff.put("2", new Employee());

        System.out.println(staff.get("2"));
    }

    private static class Employee {
    }
}
