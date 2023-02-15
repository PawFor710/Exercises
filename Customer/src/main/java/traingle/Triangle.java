package traingle;

public class Triangle {

    public boolean isThisTriangle(int a, int b, int c) {
        return a + b >  c && b + c > a && a + c > b;
    }
}
