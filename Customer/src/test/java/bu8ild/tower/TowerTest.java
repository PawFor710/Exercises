package bu8ild.tower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerTest {

    @Test
    void test() {
        //Given
        Tower tower = new Tower();
        //When
        String[] floors = tower.tower(3);
        //Then

        for (String floor : floors) {
            System.out.println(floor);
        }
    }

}