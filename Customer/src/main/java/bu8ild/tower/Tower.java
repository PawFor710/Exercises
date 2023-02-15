package bu8ild.tower;

public class Tower {

    public String[] tower(int nFloors) {

        String[] floors = new String[nFloors];

        for(int i=0; i<=nFloors - 1; i++) {

            floors[i] = "*";
        }

        return floors;
    }
}
