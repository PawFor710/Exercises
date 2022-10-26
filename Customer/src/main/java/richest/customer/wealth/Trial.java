package richest.customer.wealth;

public class Trial {
    public static void main(String[] args) {

        int accounts[][][] = new int[2][2][2];

        accounts[0][0][0] = 1;
        accounts[0][0][1] = 5;


        accounts[0][1][0] = 7;
        accounts[0][1][1] = 3;

        accounts[1][0][0] = 3;
        accounts[1][1][1] = 5;


        int sum1 = 0;
        int sumI = 0;

        int sum2 = 0;
        int sumJ = 0;

        for (int i = 0; i <= accounts.length - 1; i++) {
            for (int j = 0; j <= accounts[i].length - 1; j++) {
                for (int k = 0; k <= accounts[j].length - 1; k++) {

                    System.out.print(accounts[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}