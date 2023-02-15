package growth.of.a.population;

public class Population {

    public int populationCounter(int p0, double percent, int aug, int p) {

        int yearsNeeded = 0;

        while (p > p0) {
            p0 = (int) (p0 + (p0 * percent*0.01) + aug);
            yearsNeeded++;
        }
        return yearsNeeded;
    }
}
