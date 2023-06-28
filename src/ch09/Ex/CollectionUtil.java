package ch09.Ex;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtil<T> {
    public static <T> int countOccurrences(List<T> list, String target) {
        List<String> strList = new ArrayList<>();
        strList.add("apple");
        strList.add("banana");
        strList.add("apple");
        strList.add("cherry");
        strList.add("durian");
        strList.add("melon");

        target = "apple";   // 몇개가 있는지 찾을 특정 요소

        CollectionUtil<String> util = new CollectionUtil<>();
        int occurrenceCount = util.countOccurrences(strList, target);

        System.out.println("Number of occurrences of " + target + ": " + occurrenceCount);

        return occurrenceCount;
    }
}
