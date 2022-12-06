import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class ТЕОРИЯ_СОРТИРАНЕ_НА_MAP {
    public static void main(String[] args) {


        //Map<Integer,Integer>
        Map<Integer, Integer> map1 = new HashMap<>();

        // sorted by asc keys
        map1
                .entrySet()
                .stream()
                .sorted(comparingByKey())
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                HashMap::new));

        // sorted by desc keys
        map1
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(comparingByKey()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                HashMap::new));

        //sort аsc order of value
        map1
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        // sort desc order of value
        map1
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));


    }

}