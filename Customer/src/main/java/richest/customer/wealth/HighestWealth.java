package richest.customer.wealth;

public class HighestWealth {

    public static void main(String[] args) {

        int accounts[][] = new int[3][3];

        accounts[0][0] = 1;
        accounts[0][1] = 2;
        accounts[0][2] = 3;

        accounts[1][0] = 3;
        accounts[1][1] = 2;
        accounts[1][2] = 1;

        int sum1 = 0;
        int sumI = 0;

        int sum2 = 0;
        int sumJ = 0;

        for (int i = 0; i <= accounts.length - 1 ; i++) {
            for (int j = 0; j <= accounts[i].length - 1 ; j++) {

                System.out.print(accounts[i][j] + " ");

                sum1 += accounts[0][j];
                sumI = sum1/accounts.length;

                sum2 += accounts[1][j];
                sumJ = sum2/accounts.length;

            }
            System.out.println();
        }
        int sums[] = new int[accounts.length - 1];

        sums[0] = sumI;
        sums[1] = sumJ;

        int max = sums[0];

        for(int k = 0; k <= sums.length - 1; k++) {
            if(sums[k] > max) {
                max = sums[k];
            }
        }
        System.out.println(max);
    }
}
