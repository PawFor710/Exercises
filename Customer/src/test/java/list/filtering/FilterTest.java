package list.filtering;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {

    @Test
    void test() {
        //Given
        Filter filter = new Filter();
        //When
        List<Object> result = filter.filterList(List.of(1, 2, "a", "b"));
        //Then
        assertEquals(result, List.of(1,2));
    }

}