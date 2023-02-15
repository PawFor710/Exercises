package growth.of.a.population;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PopulationTest {

    @Test
    void test() {
        //Given
        Population population = new Population();
        //When
        int result = population.populationCounter(1000, 2, 50, 1200);
        int result2 = population.populationCounter(1500, 5, 100, 5000);
        int result3 = population.populationCounter(1500000, 2.5, 10000, 2000000);
        //Then
        assertEquals(result, 3);
        assertEquals(result2, 15);
        assertEquals(result3, 10);

        System.out.println(population.populationCounter(1000, 10, 500, 1000000));
    }

}