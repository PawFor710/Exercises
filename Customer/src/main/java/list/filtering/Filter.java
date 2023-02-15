package list.filtering;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

     public List<Object> filterList(final List<Object> list) {
         return list.stream()
                 .filter(o -> !o.getClass().getName().contains("String"))
                 .collect(Collectors.toList());
     }
}
