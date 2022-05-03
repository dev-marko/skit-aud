package junit.domasno1;

import java.util.List;

public class CommonElements {
    /**
     * if list1 or list2 is null throw NullPointerException
     * else, return a (non-null_ list of elements that are present in both lists
     * else, if there are no such elements return null
     */

    public static List<String> commonElements(List<String> list1, List<String> list2) {
        if (list1 == null || list2 == null) {
            throw new NullPointerException();
        }

        List<String> result = list1.stream().filter(list2::contains).toList();

        return result.isEmpty() ? null : result;
    }
}
